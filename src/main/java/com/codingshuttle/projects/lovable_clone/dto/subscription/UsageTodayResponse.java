package com.codingshuttle.projects.lovable_clone.dto.subscription;

public record UsageTodayResponse(
        Integer tokenUsed,
        Integer tokenLimit,
        Integer previousRunning,
        Integer previewsLimit
) {
}

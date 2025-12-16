package ru.ok.android.externcalls.sdk.layout;

import defpackage.d3h;

/* loaded from: classes2.dex */
public final class ConversationDisplayLayoutItem {
    private final d3h layout;
    private final ConversationVideoTrackParticipantKey videoTrackParticipantKey;

    public ConversationDisplayLayoutItem(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, d3h d3hVar) {
        this.videoTrackParticipantKey = conversationVideoTrackParticipantKey;
        this.layout = d3hVar;
    }

    public d3h getLayout() {
        return this.layout;
    }

    public ConversationVideoTrackParticipantKey getVideoTrackParticipantKey() {
        return this.videoTrackParticipantKey;
    }
}

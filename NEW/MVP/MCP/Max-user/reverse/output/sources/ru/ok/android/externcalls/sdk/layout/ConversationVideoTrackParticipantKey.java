package ru.ok.android.externcalls.sdk.layout;

import defpackage.cdh;
import defpackage.y2a;
import java.util.Objects;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* loaded from: classes2.dex */
public class ConversationVideoTrackParticipantKey {
    private final y2a movieId;
    private final ParticipantId participantId;
    private final cdh type;

    public static class Builder {
        private y2a movieId;
        private ParticipantId participantId;
        private cdh type = cdh.a;

        public ConversationVideoTrackParticipantKey build() {
            Objects.requireNonNull(this.participantId);
            Objects.requireNonNull(this.type);
            return new ConversationVideoTrackParticipantKey(this, 0);
        }

        public Builder setMovieId(y2a y2aVar) {
            this.movieId = y2aVar;
            return this;
        }

        public Builder setParticipantId(ParticipantId participantId) {
            this.participantId = participantId;
            return this;
        }

        public Builder setType(cdh cdhVar) {
            this.type = cdhVar;
            return this;
        }
    }

    public /* synthetic */ ConversationVideoTrackParticipantKey(Builder builder, int i) {
        this(builder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey = (ConversationVideoTrackParticipantKey) obj;
            if (this.participantId.equals(conversationVideoTrackParticipantKey.participantId) && this.type == conversationVideoTrackParticipantKey.type && Objects.equals(this.movieId, conversationVideoTrackParticipantKey.movieId)) {
                return true;
            }
        }
        return false;
    }

    public y2a getMovieId() {
        return this.movieId;
    }

    public ParticipantId getParticipantId() {
        return this.participantId;
    }

    public cdh getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.participantId, this.type, this.movieId);
    }

    public String toString() {
        return "ConversationVideoTrackParticipantKey{participantId=" + this.participantId + ", type=" + this.type + ", movieId=" + this.movieId + '}';
    }

    private ConversationVideoTrackParticipantKey(Builder builder) {
        this.participantId = builder.participantId;
        this.type = builder.type;
        this.movieId = builder.movieId;
    }
}

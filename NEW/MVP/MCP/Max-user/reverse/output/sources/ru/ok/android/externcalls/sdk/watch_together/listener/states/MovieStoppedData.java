package ru.ok.android.externcalls.sdk.watch_together.listener.states;

import defpackage.a9h;
import defpackage.d3a;
import defpackage.fje;
import defpackage.fni;
import defpackage.y2a;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\r\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J<\u0010\u0015\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0014¨\u0006)"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStoppedData;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participant", "Lfje;", "roomId", "Ly2a;", "movieId", "Ld3a;", "sourceType", "<init>", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lfje;Ly2a;Ld3a;)V", "component1", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "component2", "()Lfje;", "component3", "()Ly2a;", "component4", "()Ld3a;", "copy", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lfje;Ly2a;Ld3a;)Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStoppedData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getParticipant", "Lfje;", "getRoomId", "Ly2a;", "getMovieId", "Ld3a;", "getSourceType", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MovieStoppedData {
    private final y2a movieId;
    private final ParticipantId participant;
    private final fje roomId;
    private final d3a sourceType;

    public MovieStoppedData(ParticipantId participantId, fje fjeVar, y2a y2aVar, d3a d3aVar) {
        this.participant = participantId;
        this.roomId = fjeVar;
        this.movieId = y2aVar;
        this.sourceType = d3aVar;
    }

    public static /* synthetic */ MovieStoppedData copy$default(MovieStoppedData movieStoppedData, ParticipantId participantId, fje fjeVar, y2a y2aVar, d3a d3aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId = movieStoppedData.participant;
        }
        if ((i & 2) != 0) {
            fjeVar = movieStoppedData.roomId;
        }
        if ((i & 4) != 0) {
            y2aVar = movieStoppedData.movieId;
        }
        if ((i & 8) != 0) {
            d3aVar = movieStoppedData.sourceType;
        }
        return movieStoppedData.copy(participantId, fjeVar, y2aVar, d3aVar);
    }

    /* renamed from: component1, reason: from getter */
    public final ParticipantId getParticipant() {
        return this.participant;
    }

    /* renamed from: component2, reason: from getter */
    public final fje getRoomId() {
        return this.roomId;
    }

    /* renamed from: component3, reason: from getter */
    public final y2a getMovieId() {
        return this.movieId;
    }

    /* renamed from: component4, reason: from getter */
    public final d3a getSourceType() {
        return this.sourceType;
    }

    public final MovieStoppedData copy(ParticipantId participant, fje roomId, y2a movieId, d3a sourceType) {
        return new MovieStoppedData(participant, roomId, movieId, sourceType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MovieStoppedData)) {
            return false;
        }
        MovieStoppedData movieStoppedData = (MovieStoppedData) other;
        return fni.a(this.participant, movieStoppedData.participant) && fni.a(this.roomId, movieStoppedData.roomId) && fni.a(this.movieId, movieStoppedData.movieId) && this.sourceType == movieStoppedData.sourceType;
    }

    public final y2a getMovieId() {
        return this.movieId;
    }

    public final ParticipantId getParticipant() {
        return this.participant;
    }

    public final fje getRoomId() {
        return this.roomId;
    }

    public final d3a getSourceType() {
        return this.sourceType;
    }

    public int hashCode() {
        return this.sourceType.hashCode() + a9h.a((this.roomId.hashCode() + (this.participant.hashCode() * 31)) * 31, 31, this.movieId.a);
    }

    public String toString() {
        return "MovieStoppedData(participant=" + this.participant + ", roomId=" + this.roomId + ", movieId=" + this.movieId + ", sourceType=" + this.sourceType + ")";
    }
}

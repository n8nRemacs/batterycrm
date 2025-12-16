package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ParsingPermissionResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/ParsingPermissionResult;", "", "()V", "IncorrectData", "Ok", "Lcom/avito/android/remote/model/ParsingPermissionResult$IncorrectData;", "Lcom/avito/android/remote/model/ParsingPermissionResult$Ok;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ParsingPermissionResult {

    /* compiled from: ParsingPermissionResult.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001f\u0010\t\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/ParsingPermissionResult$IncorrectData;", "Lcom/avito/android/remote/model/ParsingPermissionResult;", "messages", "", "", "(Ljava/util/Map;)V", "getMessages", "()Ljava/util/Map;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IncorrectData extends ParsingPermissionResult {

        @c("messages")
        @k
        private final Map<String, String> messages;

        public IncorrectData(@k Map<String, String> map) {
            super(null);
            this.messages = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ IncorrectData copy$default(IncorrectData incorrectData, Map map, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                map = incorrectData.messages;
            }
            return incorrectData.copy(map);
        }

        @k
        public final Map<String, String> component1() {
            return this.messages;
        }

        @k
        public final IncorrectData copy(@k Map<String, String> messages) {
            return new IncorrectData(messages);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IncorrectData) && L.f(this.messages, ((IncorrectData) other).messages);
        }

        @k
        public final Map<String, String> getMessages() {
            return this.messages;
        }

        public int hashCode() {
            return this.messages.hashCode();
        }

        @k
        public String toString() {
            return r.w(new StringBuilder("IncorrectData(messages="), this.messages, ')');
        }
    }

    /* compiled from: ParsingPermissionResult.kt */
    @InterfaceC19823a
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/ParsingPermissionResult$Ok;", "Lcom/avito/android/remote/model/ParsingPermissionResult;", "profile", "Lcom/avito/android/remote/model/Profile;", "session", "Lcom/avito/android/remote/model/Session;", "(Lcom/avito/android/remote/model/Profile;Lcom/avito/android/remote/model/Session;)V", "getProfile", "()Lcom/avito/android/remote/model/Profile;", "getSession", "()Lcom/avito/android/remote/model/Session;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Ok extends ParsingPermissionResult {

        @k
        private final Profile profile;

        @k
        private final Session session;

        public Ok(@k Profile profile, @k Session session) {
            super(null);
            this.profile = profile;
            this.session = session;
        }

        public static /* synthetic */ Ok copy$default(Ok ok2, Profile profile, Session session, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                profile = ok2.profile;
            }
            if ((i12 & 2) != 0) {
                session = ok2.session;
            }
            return ok2.copy(profile, session);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final Profile getProfile() {
            return this.profile;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final Session getSession() {
            return this.session;
        }

        @k
        public final Ok copy(@k Profile profile, @k Session session) {
            return new Ok(profile, session);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ok)) {
                return false;
            }
            Ok ok2 = (Ok) other;
            return L.f(this.profile, ok2.profile) && L.f(this.session, ok2.session);
        }

        @k
        public final Profile getProfile() {
            return this.profile;
        }

        @k
        public final Session getSession() {
            return this.session;
        }

        public int hashCode() {
            return this.session.hashCode() + (this.profile.hashCode() * 31);
        }

        @k
        public String toString() {
            return "Ok(profile=" + this.profile + ", session=" + this.session + ')';
        }
    }

    public /* synthetic */ ParsingPermissionResult(C42822w c42822w) {
        this();
    }

    private ParsingPermissionResult() {
    }
}

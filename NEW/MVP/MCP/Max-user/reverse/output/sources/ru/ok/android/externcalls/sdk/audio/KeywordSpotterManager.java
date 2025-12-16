package ru.ok.android.externcalls.sdk.audio;

import defpackage.fni;
import defpackage.tk4;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u0007\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/KeywordSpotterManager;", "", "Lru/ok/android/externcalls/sdk/audio/KeywordSpotterManager$KeywordSpotterParams;", "params", "Lqqg;", "setKeywordSpotterParams", "(Lru/ok/android/externcalls/sdk/audio/KeywordSpotterManager$KeywordSpotterParams;)V", "KeywordSpotterConfig", "KeywordSpotterParams", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface KeywordSpotterManager {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/KeywordSpotterManager$KeywordSpotterConfig;", "", "turnOffInMs", "", "(Ljava/lang/Long;)V", "getTurnOffInMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lru/ok/android/externcalls/sdk/audio/KeywordSpotterManager$KeywordSpotterConfig;", "equals", "", "other", "hashCode", "", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class KeywordSpotterConfig {
        private final Long turnOffInMs;

        /* JADX WARN: Multi-variable type inference failed */
        public KeywordSpotterConfig() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ KeywordSpotterConfig copy$default(KeywordSpotterConfig keywordSpotterConfig, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                l = keywordSpotterConfig.turnOffInMs;
            }
            return keywordSpotterConfig.copy(l);
        }

        /* renamed from: component1, reason: from getter */
        public final Long getTurnOffInMs() {
            return this.turnOffInMs;
        }

        public final KeywordSpotterConfig copy(Long turnOffInMs) {
            return new KeywordSpotterConfig(turnOffInMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof KeywordSpotterConfig) && fni.a(this.turnOffInMs, ((KeywordSpotterConfig) other).turnOffInMs);
        }

        public final Long getTurnOffInMs() {
            return this.turnOffInMs;
        }

        public int hashCode() {
            Long l = this.turnOffInMs;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public String toString() {
            return "KeywordSpotterConfig(turnOffInMs=" + this.turnOffInMs + ")";
        }

        public KeywordSpotterConfig(Long l) {
            this.turnOffInMs = l;
        }

        public /* synthetic */ KeywordSpotterConfig(Long l, int i, tk4 tk4Var) {
            this((i & 1) != 0 ? null : l);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\t¨\u0006\u0012"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/KeywordSpotterManager$KeywordSpotterParams;", "", "isEnabled", "", "filePath", "", "(ZLjava/lang/String;)V", "getFilePath", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class KeywordSpotterParams {
        private final String filePath;
        private final boolean isEnabled;

        public KeywordSpotterParams(boolean z, String str) {
            this.isEnabled = z;
            this.filePath = str;
        }

        public static /* synthetic */ KeywordSpotterParams copy$default(KeywordSpotterParams keywordSpotterParams, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = keywordSpotterParams.isEnabled;
            }
            if ((i & 2) != 0) {
                str = keywordSpotterParams.filePath;
            }
            return keywordSpotterParams.copy(z, str);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFilePath() {
            return this.filePath;
        }

        public final KeywordSpotterParams copy(boolean isEnabled, String filePath) {
            return new KeywordSpotterParams(isEnabled, filePath);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof KeywordSpotterParams)) {
                return false;
            }
            KeywordSpotterParams keywordSpotterParams = (KeywordSpotterParams) other;
            return this.isEnabled == keywordSpotterParams.isEnabled && fni.a(this.filePath, keywordSpotterParams.filePath);
        }

        public final String getFilePath() {
            return this.filePath;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isEnabled) * 31;
            String str = this.filePath;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public String toString() {
            return "KeywordSpotterParams(isEnabled=" + this.isEnabled + ", filePath=" + this.filePath + ")";
        }
    }

    void setKeywordSpotterParams(KeywordSpotterParams params);
}

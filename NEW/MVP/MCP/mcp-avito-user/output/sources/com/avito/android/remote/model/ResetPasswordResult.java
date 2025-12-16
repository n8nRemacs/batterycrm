package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ResetPasswordResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/ResetPasswordResult;", "", "()V", "ViaCode", "ViaLink", "Lcom/avito/android/remote/model/ResetPasswordResult$ViaCode;", "Lcom/avito/android/remote/model/ResetPasswordResult$ViaLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ResetPasswordResult {

    /* compiled from: ResetPasswordResult.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/ResetPasswordResult$ViaCode;", "Lcom/avito/android/remote/model/ResetPasswordResult;", "text", "", "codeTimeout", "", "codeLength", "", "(Ljava/lang/String;JI)V", "getCodeLength", "()I", "getCodeTimeout", "()J", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "toString", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ViaCode extends ResetPasswordResult {

        @c("codeLength")
        private final int codeLength;

        @c("codeTimeout")
        private final long codeTimeout;

        @c("text")
        @k
        private final String text;

        public ViaCode(@k String str, long j12, int i12) {
            super(null);
            this.text = str;
            this.codeTimeout = j12;
            this.codeLength = i12;
        }

        public static /* synthetic */ ViaCode copy$default(ViaCode viaCode, String str, long j12, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = viaCode.text;
            }
            if ((i13 & 2) != 0) {
                j12 = viaCode.codeTimeout;
            }
            if ((i13 & 4) != 0) {
                i12 = viaCode.codeLength;
            }
            return viaCode.copy(str, j12, i12);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final long getCodeTimeout() {
            return this.codeTimeout;
        }

        /* renamed from: component3, reason: from getter */
        public final int getCodeLength() {
            return this.codeLength;
        }

        @k
        public final ViaCode copy(@k String text, long codeTimeout, int codeLength) {
            return new ViaCode(text, codeTimeout, codeLength);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViaCode)) {
                return false;
            }
            ViaCode viaCode = (ViaCode) other;
            return L.f(this.text, viaCode.text) && this.codeTimeout == viaCode.codeTimeout && this.codeLength == viaCode.codeLength;
        }

        public final int getCodeLength() {
            return this.codeLength;
        }

        public final long getCodeTimeout() {
            return this.codeTimeout;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return Integer.hashCode(this.codeLength) + r.g(this.text.hashCode() * 31, 31, this.codeTimeout);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViaCode(text=");
            sb2.append(this.text);
            sb2.append(", codeTimeout=");
            sb2.append(this.codeTimeout);
            sb2.append(", codeLength=");
            return r.t(sb2, this.codeLength, ')');
        }
    }

    /* compiled from: ResetPasswordResult.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/ResetPasswordResult$ViaLink;", "Lcom/avito/android/remote/model/ResetPasswordResult;", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ViaLink extends ResetPasswordResult {

        @c("text")
        @k
        private final String text;

        public ViaLink(@k String str) {
            super(null);
            this.text = str;
        }

        public static /* synthetic */ ViaLink copy$default(ViaLink viaLink, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = viaLink.text;
            }
            return viaLink.copy(str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        public final ViaLink copy(@k String text) {
            return new ViaLink(text);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViaLink) && L.f(this.text, ((ViaLink) other).text);
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("ViaLink(text="), this.text, ')');
        }
    }

    public /* synthetic */ ResetPasswordResult(C42822w c42822w) {
        this();
    }

    private ResetPasswordResult() {
    }
}

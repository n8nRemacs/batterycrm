package com.avito.android.iac_dialer.impl_module.final_link;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.L;

/* compiled from: IacFinalLinkInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor;", "", "a", "FinishReason", "Params", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface IacFinalLinkInteractor {

    /* compiled from: IacFinalLinkInteractor.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason;", "LdL/d;", "BusyByGsm", "BusyByIac", "CanNotRecallByError", "CanNotRecallByReason", "CreateCallError", "Error", "HangupByLocal", "HangupByPeer", "NoCameraAccess", "NoMicAccess", "Reject", "TimeoutAnswer", "TimeoutConnect", "Unknown", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$BusyByGsm;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$BusyByIac;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$CanNotRecallByError;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$CanNotRecallByReason;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$CreateCallError;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$Error;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$HangupByLocal;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$HangupByPeer;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$NoCameraAccess;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$NoMicAccess;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$Reject;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$TimeoutAnswer;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$TimeoutConnect;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$Unknown;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface FinishReason extends dL.d {

        /* compiled from: IacFinalLinkInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$BusyByGsm;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class BusyByGsm implements FinishReason {
            public static final int $stable = 0;

            @k
            public static final BusyByGsm INSTANCE = new BusyByGsm();

            private BusyByGsm() {
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof BusyByGsm);
            }

            public int hashCode() {
                return 1844519956;
            }

            @k
            public String toString() {
                return "BusyByGsm";
            }
        }

        /* compiled from: IacFinalLinkInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$BusyByIac;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class BusyByIac implements FinishReason {
            public static final int $stable = 0;

            @k
            public static final BusyByIac INSTANCE = new BusyByIac();

            private BusyByIac() {
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof BusyByIac);
            }

            public int hashCode() {
                return 1844521310;
            }

            @k
            public String toString() {
                return "BusyByIac";
            }
        }

        /* compiled from: IacFinalLinkInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$CanNotRecallByError;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CanNotRecallByError implements FinishReason {
            public static final int $stable = 0;

            @k
            public static final CanNotRecallByError INSTANCE = new CanNotRecallByError();

            private CanNotRecallByError() {
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof CanNotRecallByError);
            }

            public int hashCode() {
                return 98984224;
            }

            @k
            public String toString() {
                return "CanNotRecallByError";
            }
        }

        /* compiled from: IacFinalLinkInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$CanNotRecallByReason;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason;", "canCallReason", "", "(Ljava/lang/String;)V", "getCanCallReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CanNotRecallByReason implements FinishReason {
            public static final int $stable = 0;

            @k
            private final String canCallReason;

            public CanNotRecallByReason(@k String str) {
                this.canCallReason = str;
            }

            public static /* synthetic */ CanNotRecallByReason copy$default(CanNotRecallByReason canNotRecallByReason, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = canNotRecallByReason.canCallReason;
                }
                return canNotRecallByReason.copy(str);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getCanCallReason() {
                return this.canCallReason;
            }

            @k
            public final CanNotRecallByReason copy(@k String canCallReason) {
                return new CanNotRecallByReason(canCallReason);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CanNotRecallByReason) && L.f(this.canCallReason, ((CanNotRecallByReason) other).canCallReason);
            }

            @k
            public final String getCanCallReason() {
                return this.canCallReason;
            }

            public int hashCode() {
                return this.canCallReason.hashCode();
            }

            @k
            public String toString() {
                return C22026a.c(new StringBuilder("CanNotRecallByReason(canCallReason="), this.canCallReason, ')');
            }
        }

        /* compiled from: IacFinalLinkInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$CreateCallError;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CreateCallError implements FinishReason {
            public static final int $stable = 0;

            @k
            public static final CreateCallError INSTANCE = new CreateCallError();

            private CreateCallError() {
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof CreateCallError);
            }

            public int hashCode() {
                return -815714351;
            }

            @k
            public String toString() {
                return "CreateCallError";
            }
        }

        /* compiled from: IacFinalLinkInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$Error;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Error implements FinishReason {
            public static final int $stable = 0;

            @k
            public static final Error INSTANCE = new Error();

            private Error() {
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return 1631253739;
            }

            @k
            public String toString() {
                return "Error";
            }
        }

        /* compiled from: IacFinalLinkInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$HangupByLocal;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class HangupByLocal implements FinishReason {
            public static final int $stable = 0;

            @k
            public static final HangupByLocal INSTANCE = new HangupByLocal();

            private HangupByLocal() {
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof HangupByLocal);
            }

            public int hashCode() {
                return -733927958;
            }

            @k
            public String toString() {
                return "HangupByLocal";
            }
        }

        /* compiled from: IacFinalLinkInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$HangupByPeer;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class HangupByPeer implements FinishReason {
            public static final int $stable = 0;

            @k
            public static final HangupByPeer INSTANCE = new HangupByPeer();

            private HangupByPeer() {
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof HangupByPeer);
            }

            public int hashCode() {
                return 946265859;
            }

            @k
            public String toString() {
                return "HangupByPeer";
            }
        }

        /* compiled from: IacFinalLinkInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$NoCameraAccess;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NoCameraAccess implements FinishReason {
            public static final int $stable = 0;

            @k
            public static final NoCameraAccess INSTANCE = new NoCameraAccess();

            private NoCameraAccess() {
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof NoCameraAccess);
            }

            public int hashCode() {
                return -1308235321;
            }

            @k
            public String toString() {
                return "NoCameraAccess";
            }
        }

        /* compiled from: IacFinalLinkInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$NoMicAccess;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NoMicAccess implements FinishReason {
            public static final int $stable = 0;

            @k
            public static final NoMicAccess INSTANCE = new NoMicAccess();

            private NoMicAccess() {
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof NoMicAccess);
            }

            public int hashCode() {
                return -358719891;
            }

            @k
            public String toString() {
                return "NoMicAccess";
            }
        }

        /* compiled from: IacFinalLinkInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$Reject;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Reject implements FinishReason {
            public static final int $stable = 0;

            @k
            public static final Reject INSTANCE = new Reject();

            private Reject() {
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof Reject);
            }

            public int hashCode() {
                return -610816740;
            }

            @k
            public String toString() {
                return "Reject";
            }
        }

        /* compiled from: IacFinalLinkInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$TimeoutAnswer;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TimeoutAnswer implements FinishReason {
            public static final int $stable = 0;

            @k
            public static final TimeoutAnswer INSTANCE = new TimeoutAnswer();

            private TimeoutAnswer() {
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof TimeoutAnswer);
            }

            public int hashCode() {
                return 1200602210;
            }

            @k
            public String toString() {
                return "TimeoutAnswer";
            }
        }

        /* compiled from: IacFinalLinkInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$TimeoutConnect;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TimeoutConnect implements FinishReason {
            public static final int $stable = 0;

            @k
            public static final TimeoutConnect INSTANCE = new TimeoutConnect();

            private TimeoutConnect() {
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof TimeoutConnect);
            }

            public int hashCode() {
                return 362713286;
            }

            @k
            public String toString() {
                return "TimeoutConnect";
            }
        }

        /* compiled from: IacFinalLinkInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason$Unknown;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Unknown implements FinishReason {
            public static final int $stable = 0;

            @k
            private final String value;

            public Unknown(@k String str) {
                this.value = str;
            }

            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = unknown.value;
                }
                return unknown.copy(str);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            @k
            public final Unknown copy(@k String value) {
                return new Unknown(value);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Unknown) && L.f(this.value, ((Unknown) other).value);
            }

            @k
            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            @k
            public String toString() {
                return C22026a.c(new StringBuilder("Unknown(value="), this.value, ')');
            }
        }
    }

    /* compiled from: IacFinalLinkInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0014\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\u0017J\u008c\u0001\u0010$\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0015J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b\u0006\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010\u001dR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b9\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b:\u0010\u0017R\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b;\u0010\u001dR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b<\u0010\u0017¨\u0006="}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$Params;", "LdL/d;", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "", "isInitialized", "", "callDuration", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason;", "finishReason", "wasRingingReceived", "", "customParams", "micAccess", "micCanAsk", "cameraAccess", "cameraCanAsk", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason;ZLjava/util/Map;ZLjava/lang/Boolean;ZLjava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/Long;", "component4", "()Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason;", "component5", "()Z", "component6", "()Ljava/util/Map;", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason;ZLjava/util/Map;ZLjava/lang/Boolean;ZLjava/lang/Boolean;)Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$Params;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallId", "Ljava/lang/Boolean;", "Ljava/lang/Long;", "getCallDuration", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason;", "getFinishReason", "Z", "getWasRingingReceived", "Ljava/util/Map;", "getCustomParams", "getMicAccess", "getMicCanAsk", "getCameraAccess", "getCameraCanAsk", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Params implements dL.d {
        public static final int $stable = 8;

        @l
        private final Long callDuration;

        @k
        private final String callId;
        private final boolean cameraAccess;

        @l
        private final Boolean cameraCanAsk;

        @k
        private final Map<String, String> customParams;

        @k
        private final FinishReason finishReason;

        @l
        private final Boolean isInitialized;
        private final boolean micAccess;

        @l
        private final Boolean micCanAsk;
        private final boolean wasRingingReceived;

        public Params(@k String str, @l Boolean bool, @l Long l12, @k FinishReason finishReason, boolean z12, @k Map<String, String> map, boolean z13, @l Boolean bool2, boolean z14, @l Boolean bool3) {
            this.callId = str;
            this.isInitialized = bool;
            this.callDuration = l12;
            this.finishReason = finishReason;
            this.wasRingingReceived = z12;
            this.customParams = map;
            this.micAccess = z13;
            this.micCanAsk = bool2;
            this.cameraAccess = z14;
            this.cameraCanAsk = bool3;
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final Boolean getCameraCanAsk() {
            return this.cameraCanAsk;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Boolean getIsInitialized() {
            return this.isInitialized;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Long getCallDuration() {
            return this.callDuration;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final FinishReason getFinishReason() {
            return this.finishReason;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getWasRingingReceived() {
            return this.wasRingingReceived;
        }

        @k
        public final Map<String, String> component6() {
            return this.customParams;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getMicAccess() {
            return this.micAccess;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final Boolean getMicCanAsk() {
            return this.micCanAsk;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getCameraAccess() {
            return this.cameraAccess;
        }

        @k
        public final Params copy(@k String callId, @l Boolean isInitialized, @l Long callDuration, @k FinishReason finishReason, boolean wasRingingReceived, @k Map<String, String> customParams, boolean micAccess, @l Boolean micCanAsk, boolean cameraAccess, @l Boolean cameraCanAsk) {
            return new Params(callId, isInitialized, callDuration, finishReason, wasRingingReceived, customParams, micAccess, micCanAsk, cameraAccess, cameraCanAsk);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return L.f(this.callId, params.callId) && L.f(this.isInitialized, params.isInitialized) && L.f(this.callDuration, params.callDuration) && L.f(this.finishReason, params.finishReason) && this.wasRingingReceived == params.wasRingingReceived && L.f(this.customParams, params.customParams) && this.micAccess == params.micAccess && L.f(this.micCanAsk, params.micCanAsk) && this.cameraAccess == params.cameraAccess && L.f(this.cameraCanAsk, params.cameraCanAsk);
        }

        @l
        public final Long getCallDuration() {
            return this.callDuration;
        }

        @k
        public final String getCallId() {
            return this.callId;
        }

        public final boolean getCameraAccess() {
            return this.cameraAccess;
        }

        @l
        public final Boolean getCameraCanAsk() {
            return this.cameraCanAsk;
        }

        @k
        public final Map<String, String> getCustomParams() {
            return this.customParams;
        }

        @k
        public final FinishReason getFinishReason() {
            return this.finishReason;
        }

        public final boolean getMicAccess() {
            return this.micAccess;
        }

        @l
        public final Boolean getMicCanAsk() {
            return this.micCanAsk;
        }

        public final boolean getWasRingingReceived() {
            return this.wasRingingReceived;
        }

        public int hashCode() {
            int iHashCode = this.callId.hashCode() * 31;
            Boolean bool = this.isInitialized;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Long l12 = this.callDuration;
            int i12 = r.i(AK.c.c(r.i((this.finishReason.hashCode() + ((iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31)) * 31, 31, this.wasRingingReceived), 31, this.customParams), 31, this.micAccess);
            Boolean bool2 = this.micCanAsk;
            int i13 = r.i((i12 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.cameraAccess);
            Boolean bool3 = this.cameraCanAsk;
            return i13 + (bool3 != null ? bool3.hashCode() : 0);
        }

        @l
        public final Boolean isInitialized() {
            return this.isInitialized;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Params(callId=");
            sb2.append(this.callId);
            sb2.append(", isInitialized=");
            sb2.append(this.isInitialized);
            sb2.append(", callDuration=");
            sb2.append(this.callDuration);
            sb2.append(", finishReason=");
            sb2.append(this.finishReason);
            sb2.append(", wasRingingReceived=");
            sb2.append(this.wasRingingReceived);
            sb2.append(", customParams=");
            sb2.append(this.customParams);
            sb2.append(", micAccess=");
            sb2.append(this.micAccess);
            sb2.append(", micCanAsk=");
            sb2.append(this.micCanAsk);
            sb2.append(", cameraAccess=");
            sb2.append(this.cameraAccess);
            sb2.append(", cameraCanAsk=");
            return C0.g(sb2, this.cameraCanAsk, ')');
        }
    }

    /* compiled from: IacFinalLinkInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$a;", "", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f165997a = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Q<String, String> f165998b = new Q<>("WAIT_BOTTOM_SHEET_GSM", "true");

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Q<String, String> f165999c = new Q<>("ACTIVE_FALLBACK_GSM", "true");

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final Q<String, String> f166000d = new Q<>("IS_CALL_REAL_TELECOM", "true");
    }

    @l
    Object a(@k Params params, @k ContinuationImpl continuationImpl);
}

package com.avito.android.mortgage.sign.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.mortgage.sign.draw.c;
import com.avito.android.remote.error.ApiError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SignInternalAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "DrawingStarted", "EmptySvgCreated", "Init", "PathEnded", "PointDrawed", "SignCleared", "SvgFileCreationFailure", "SvgFileUploadingEnded", "SvgFileUploadingError", "SvgFileUploadingStarted", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction$DrawingStarted;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction$EmptySvgCreated;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction$Init;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction$PathEnded;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction$PointDrawed;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction$SignCleared;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction$SvgFileCreationFailure;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction$SvgFileUploadingEnded;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction$SvgFileUploadingError;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction$SvgFileUploadingStarted;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SignInternalAction extends n {

    /* compiled from: SignInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction$DrawingStarted;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DrawingStarted implements SignInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DrawingStarted f203775b = new DrawingStarted();

        private DrawingStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof DrawingStarted);
        }

        public final int hashCode() {
            return 279823150;
        }

        @k
        public final String toString() {
            return "DrawingStarted";
        }
    }

    /* compiled from: SignInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction$EmptySvgCreated;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EmptySvgCreated implements SignInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final EmptySvgCreated f203776b = new EmptySvgCreated();

        private EmptySvgCreated() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof EmptySvgCreated);
        }

        public final int hashCode() {
            return 746667462;
        }

        @k
        public final String toString() {
            return "EmptySvgCreated";
        }
    }

    /* compiled from: SignInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction$Init;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements SignInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Init f203777b = new Init();

        private Init() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Init);
        }

        public final int hashCode() {
            return -2015261829;
        }

        @k
        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: SignInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction$PathEnded;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PathEnded implements SignInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<c> f203778b;

        /* JADX WARN: Multi-variable type inference failed */
        public PathEnded(@k List<? extends c> list) {
            this.f203778b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PathEnded) && L.f(this.f203778b, ((PathEnded) obj).f203778b);
        }

        public final int hashCode() {
            return this.f203778b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("PathEnded(actions="), this.f203778b, ')');
        }
    }

    /* compiled from: SignInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction$PointDrawed;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PointDrawed implements SignInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final float f203779b;

        /* renamed from: c, reason: collision with root package name */
        public final float f203780c;

        public PointDrawed(float f12, float f13) {
            this.f203779b = f12;
            this.f203780c = f13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PointDrawed)) {
                return false;
            }
            PointDrawed pointDrawed = (PointDrawed) obj;
            return Float.compare(this.f203779b, pointDrawed.f203779b) == 0 && Float.compare(this.f203780c, pointDrawed.f203780c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f203780c) + (Float.hashCode(this.f203779b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PointDrawed(x=");
            sb2.append(this.f203779b);
            sb2.append(", y=");
            return r.k(')', this.f203780c, sb2);
        }
    }

    /* compiled from: SignInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction$SignCleared;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SignCleared implements SignInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SignCleared f203781b = new SignCleared();

        private SignCleared() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SignCleared);
        }

        public final int hashCode() {
            return 1065777764;
        }

        @k
        public final String toString() {
            return "SignCleared";
        }
    }

    /* compiled from: SignInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction$SvgFileCreationFailure;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SvgFileCreationFailure implements SignInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SvgFileCreationFailure f203782b = new SvgFileCreationFailure();

        private SvgFileCreationFailure() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SvgFileCreationFailure);
        }

        public final int hashCode() {
            return 1670501686;
        }

        @k
        public final String toString() {
            return "SvgFileCreationFailure";
        }
    }

    /* compiled from: SignInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction$SvgFileUploadingEnded;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SvgFileUploadingEnded implements SignInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SvgFileUploadingEnded f203783b = new SvgFileUploadingEnded();

        private SvgFileUploadingEnded() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SvgFileUploadingEnded);
        }

        public final int hashCode() {
            return -384951282;
        }

        @k
        public final String toString() {
            return "SvgFileUploadingEnded";
        }
    }

    /* compiled from: SignInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction$SvgFileUploadingError;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SvgFileUploadingError implements SignInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f203784b;

        public SvgFileUploadingError(@k ApiError apiError) {
            this.f203784b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SvgFileUploadingError) && L.f(this.f203784b, ((SvgFileUploadingError) obj).f203784b);
        }

        public final int hashCode() {
            return this.f203784b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("SvgFileUploadingError(error="), this.f203784b, ')');
        }
    }

    /* compiled from: SignInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction$SvgFileUploadingStarted;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SvgFileUploadingStarted implements SignInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SvgFileUploadingStarted f203785b = new SvgFileUploadingStarted();

        private SvgFileUploadingStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SvgFileUploadingStarted);
        }

        public final int hashCode() {
            return -861434667;
        }

        @k
        public final String toString() {
            return "SvgFileUploadingStarted";
        }
    }
}

package com.avito.beduin.v2.engine;

import com.avito.beduin.v2.engine.DisableCalculationCache;
import com.avito.beduin.v2.engine.DisableComponentStateAutoCapturing;
import com.avito.beduin.v2.engine.DisableCompositionCache;
import com.avito.beduin.v2.engine.DisableEmptyStructureIsNull;
import com.avito.beduin.v2.engine.DisableNewBaseLayoutsIOS;
import com.avito.beduin.v2.engine.DisableScopeContainer;
import com.avito.beduin.v2.engine.DisableStatePatch;
import com.avito.beduin.v2.engine.EnableClosestScopePriority;
import com.avito.beduin.v2.engine.EnableForceNetworkRequestKey;
import com.avito.beduin.v2.engine.EnableInternalNavigation;
import com.avito.beduin.v2.engine.EnableRecycleLazyContainersByDefault;
import com.avito.beduin.v2.engine.EnableRememberRedeclarationCheck;
import com.avito.beduin.v2.engine.EnableRemoveUnknownArgs;
import com.avito.beduin.v2.engine.EnableSeparatedLayoutParams;
import com.avito.beduin.v2.engine.EnableStraightResolve;
import com.avito.beduin.v2.engine.EnableStructuredMutable;
import com.avito.beduin.v2.engine.EnableValuesDestruction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: ScenarioFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/H;", "", "a", "b", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f336474a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f336475b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f336476c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f336477d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f336478e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f336479f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f336480g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f336481h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f336482i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f336483j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f336484k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f336485l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f336486m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final EnableTypedPrimitives f336487n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f336488o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f336489p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f336490q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f336491r;

    /* compiled from: ScenarioFeatures.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/H$a;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: s, reason: collision with root package name */
        @Y61.k
        public static final C10436a f336492s = new C10436a(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final DisableStatePatch f336493a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final EnableStructuredMutable f336494b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final EnableClosestScopePriority f336495c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final DisableScopeContainer f336496d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final EnableStraightResolve f336497e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final DisableEmptyStructureIsNull f336498f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final EnableInternalNavigation f336499g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final DisableCalculationCache f336500h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final DisableCompositionCache f336501i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final EnableRememberRedeclarationCheck f336502j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final DisableComponentStateAutoCapturing f336503k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final EnableTypedPrimitives f336504l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final EnableValuesDestruction f336505m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public final EnableSeparatedLayoutParams f336506n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.l
        public final EnableRecycleLazyContainersByDefault f336507o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.l
        public final EnableRemoveUnknownArgs f336508p;

        /* renamed from: q, reason: collision with root package name */
        @Y61.l
        public final EnableForceNetworkRequestKey f336509q;

        /* renamed from: r, reason: collision with root package name */
        @Y61.l
        public final DisableNewBaseLayoutsIOS f336510r;

        /* compiled from: ScenarioFeatures.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/H$a$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.engine.H$a$a, reason: collision with other inner class name */
        public static final class C10436a {
            public /* synthetic */ C10436a(C42822w c42822w) {
                this();
            }

            public C10436a() {
            }
        }

        public a() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
        }

        @Y61.k
        public final a a(@Y61.k a aVar) {
            DisableStatePatch disableStatePatch = aVar.f336493a;
            if (disableStatePatch == null) {
                disableStatePatch = this.f336493a;
            }
            EnableStructuredMutable enableStructuredMutable = aVar.f336494b;
            if (enableStructuredMutable == null) {
                enableStructuredMutable = this.f336494b;
            }
            EnableClosestScopePriority enableClosestScopePriority = aVar.f336495c;
            if (enableClosestScopePriority == null) {
                enableClosestScopePriority = this.f336495c;
            }
            DisableScopeContainer disableScopeContainer = aVar.f336496d;
            if (disableScopeContainer == null) {
                disableScopeContainer = this.f336496d;
            }
            EnableStraightResolve enableStraightResolve = aVar.f336497e;
            if (enableStraightResolve == null) {
                enableStraightResolve = this.f336497e;
            }
            DisableEmptyStructureIsNull disableEmptyStructureIsNull = aVar.f336498f;
            if (disableEmptyStructureIsNull == null) {
                disableEmptyStructureIsNull = this.f336498f;
            }
            EnableInternalNavigation enableInternalNavigation = aVar.f336499g;
            if (enableInternalNavigation == null) {
                enableInternalNavigation = this.f336499g;
            }
            DisableCalculationCache disableCalculationCache = aVar.f336500h;
            if (disableCalculationCache == null) {
                disableCalculationCache = this.f336500h;
            }
            DisableCompositionCache disableCompositionCache = aVar.f336501i;
            if (disableCompositionCache == null) {
                disableCompositionCache = this.f336501i;
            }
            EnableRememberRedeclarationCheck enableRememberRedeclarationCheck = aVar.f336502j;
            if (enableRememberRedeclarationCheck == null) {
                enableRememberRedeclarationCheck = this.f336502j;
            }
            DisableComponentStateAutoCapturing disableComponentStateAutoCapturing = aVar.f336503k;
            if (disableComponentStateAutoCapturing == null) {
                disableComponentStateAutoCapturing = this.f336503k;
            }
            EnableTypedPrimitives enableTypedPrimitives = aVar.f336504l;
            if (enableTypedPrimitives == null) {
                enableTypedPrimitives = this.f336504l;
            }
            EnableValuesDestruction enableValuesDestruction = aVar.f336505m;
            if (enableValuesDestruction == null) {
                enableValuesDestruction = this.f336505m;
            }
            EnableSeparatedLayoutParams enableSeparatedLayoutParams = aVar.f336506n;
            if (enableSeparatedLayoutParams == null) {
                enableSeparatedLayoutParams = this.f336506n;
            }
            EnableSeparatedLayoutParams enableSeparatedLayoutParams2 = enableSeparatedLayoutParams;
            EnableRecycleLazyContainersByDefault enableRecycleLazyContainersByDefault = aVar.f336507o;
            if (enableRecycleLazyContainersByDefault == null) {
                enableRecycleLazyContainersByDefault = this.f336507o;
            }
            EnableRecycleLazyContainersByDefault enableRecycleLazyContainersByDefault2 = enableRecycleLazyContainersByDefault;
            EnableRemoveUnknownArgs enableRemoveUnknownArgs = aVar.f336508p;
            if (enableRemoveUnknownArgs == null) {
                enableRemoveUnknownArgs = this.f336508p;
            }
            EnableRemoveUnknownArgs enableRemoveUnknownArgs2 = enableRemoveUnknownArgs;
            EnableForceNetworkRequestKey enableForceNetworkRequestKey = aVar.f336509q;
            if (enableForceNetworkRequestKey == null) {
                enableForceNetworkRequestKey = this.f336509q;
            }
            EnableForceNetworkRequestKey enableForceNetworkRequestKey2 = enableForceNetworkRequestKey;
            DisableNewBaseLayoutsIOS disableNewBaseLayoutsIOS = aVar.f336510r;
            if (disableNewBaseLayoutsIOS == null) {
                disableNewBaseLayoutsIOS = this.f336510r;
            }
            return new a(disableStatePatch, enableStructuredMutable, enableClosestScopePriority, disableScopeContainer, enableStraightResolve, disableEmptyStructureIsNull, enableInternalNavigation, disableCalculationCache, disableCompositionCache, enableRememberRedeclarationCheck, disableComponentStateAutoCapturing, enableTypedPrimitives, enableValuesDestruction, enableSeparatedLayoutParams2, enableRecycleLazyContainersByDefault2, enableRemoveUnknownArgs2, enableForceNetworkRequestKey2, disableNewBaseLayoutsIOS);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f336493a == aVar.f336493a && this.f336494b == aVar.f336494b && this.f336495c == aVar.f336495c && this.f336496d == aVar.f336496d && this.f336497e == aVar.f336497e && this.f336498f == aVar.f336498f && this.f336499g == aVar.f336499g && this.f336500h == aVar.f336500h && this.f336501i == aVar.f336501i && this.f336502j == aVar.f336502j && this.f336503k == aVar.f336503k && this.f336504l == aVar.f336504l && this.f336505m == aVar.f336505m && this.f336506n == aVar.f336506n && this.f336507o == aVar.f336507o && this.f336508p == aVar.f336508p && this.f336509q == aVar.f336509q && this.f336510r == aVar.f336510r;
        }

        public final int hashCode() {
            DisableStatePatch disableStatePatch = this.f336493a;
            int iHashCode = (disableStatePatch == null ? 0 : disableStatePatch.hashCode()) * 31;
            EnableStructuredMutable enableStructuredMutable = this.f336494b;
            int iHashCode2 = (iHashCode + (enableStructuredMutable == null ? 0 : enableStructuredMutable.hashCode())) * 31;
            EnableClosestScopePriority enableClosestScopePriority = this.f336495c;
            int iHashCode3 = (iHashCode2 + (enableClosestScopePriority == null ? 0 : enableClosestScopePriority.hashCode())) * 31;
            DisableScopeContainer disableScopeContainer = this.f336496d;
            int iHashCode4 = (iHashCode3 + (disableScopeContainer == null ? 0 : disableScopeContainer.hashCode())) * 31;
            EnableStraightResolve enableStraightResolve = this.f336497e;
            int iHashCode5 = (iHashCode4 + (enableStraightResolve == null ? 0 : enableStraightResolve.hashCode())) * 31;
            DisableEmptyStructureIsNull disableEmptyStructureIsNull = this.f336498f;
            int iHashCode6 = (iHashCode5 + (disableEmptyStructureIsNull == null ? 0 : disableEmptyStructureIsNull.hashCode())) * 31;
            EnableInternalNavigation enableInternalNavigation = this.f336499g;
            int iHashCode7 = (iHashCode6 + (enableInternalNavigation == null ? 0 : enableInternalNavigation.hashCode())) * 31;
            DisableCalculationCache disableCalculationCache = this.f336500h;
            int iHashCode8 = (iHashCode7 + (disableCalculationCache == null ? 0 : disableCalculationCache.hashCode())) * 31;
            DisableCompositionCache disableCompositionCache = this.f336501i;
            int iHashCode9 = (iHashCode8 + (disableCompositionCache == null ? 0 : disableCompositionCache.hashCode())) * 31;
            EnableRememberRedeclarationCheck enableRememberRedeclarationCheck = this.f336502j;
            int iHashCode10 = (iHashCode9 + (enableRememberRedeclarationCheck == null ? 0 : enableRememberRedeclarationCheck.hashCode())) * 31;
            DisableComponentStateAutoCapturing disableComponentStateAutoCapturing = this.f336503k;
            int iHashCode11 = (iHashCode10 + (disableComponentStateAutoCapturing == null ? 0 : disableComponentStateAutoCapturing.hashCode())) * 31;
            EnableTypedPrimitives enableTypedPrimitives = this.f336504l;
            int iHashCode12 = (iHashCode11 + (enableTypedPrimitives == null ? 0 : enableTypedPrimitives.hashCode())) * 31;
            EnableValuesDestruction enableValuesDestruction = this.f336505m;
            int iHashCode13 = (iHashCode12 + (enableValuesDestruction == null ? 0 : enableValuesDestruction.hashCode())) * 31;
            EnableSeparatedLayoutParams enableSeparatedLayoutParams = this.f336506n;
            int iHashCode14 = (iHashCode13 + (enableSeparatedLayoutParams == null ? 0 : enableSeparatedLayoutParams.hashCode())) * 31;
            EnableRecycleLazyContainersByDefault enableRecycleLazyContainersByDefault = this.f336507o;
            int iHashCode15 = (iHashCode14 + (enableRecycleLazyContainersByDefault == null ? 0 : enableRecycleLazyContainersByDefault.hashCode())) * 31;
            EnableRemoveUnknownArgs enableRemoveUnknownArgs = this.f336508p;
            int iHashCode16 = (iHashCode15 + (enableRemoveUnknownArgs == null ? 0 : enableRemoveUnknownArgs.hashCode())) * 31;
            EnableForceNetworkRequestKey enableForceNetworkRequestKey = this.f336509q;
            int iHashCode17 = (iHashCode16 + (enableForceNetworkRequestKey == null ? 0 : enableForceNetworkRequestKey.hashCode())) * 31;
            DisableNewBaseLayoutsIOS disableNewBaseLayoutsIOS = this.f336510r;
            return iHashCode17 + (disableNewBaseLayoutsIOS != null ? disableNewBaseLayoutsIOS.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "Preferences(disableStatePatch=" + this.f336493a + ", enableStructuredMutable=" + this.f336494b + ", enableClosestScopePriority=" + this.f336495c + ", disableScopeContainer=" + this.f336496d + ", enableStraightResolve=" + this.f336497e + ", disableEmptyStructureIsNull=" + this.f336498f + ", enableInternalNavigation=" + this.f336499g + ", disableCalculationCache=" + this.f336500h + ", disableCompositionCache=" + this.f336501i + ", enableRememberRedeclarationCheck=" + this.f336502j + ", disableComponentStateAutoCapturing=" + this.f336503k + ", enableTypedPrimitives=" + this.f336504l + ", enableValuesDestruction=" + this.f336505m + ", enableSeparatedLayoutParams=" + this.f336506n + ", enableRecycleLazyContainersByDefault=" + this.f336507o + ", enableRemoveUnknownArgs=" + this.f336508p + ", enableForceNetworkRequestKey=" + this.f336509q + ", disableNewBaseLayoutsIOS=" + this.f336510r + ')';
        }

        public a(@Y61.l DisableStatePatch disableStatePatch, @Y61.l EnableStructuredMutable enableStructuredMutable, @Y61.l EnableClosestScopePriority enableClosestScopePriority, @Y61.l DisableScopeContainer disableScopeContainer, @Y61.l EnableStraightResolve enableStraightResolve, @Y61.l DisableEmptyStructureIsNull disableEmptyStructureIsNull, @Y61.l EnableInternalNavigation enableInternalNavigation, @Y61.l DisableCalculationCache disableCalculationCache, @Y61.l DisableCompositionCache disableCompositionCache, @Y61.l EnableRememberRedeclarationCheck enableRememberRedeclarationCheck, @Y61.l DisableComponentStateAutoCapturing disableComponentStateAutoCapturing, @Y61.l EnableTypedPrimitives enableTypedPrimitives, @Y61.l EnableValuesDestruction enableValuesDestruction, @Y61.l EnableSeparatedLayoutParams enableSeparatedLayoutParams, @Y61.l EnableRecycleLazyContainersByDefault enableRecycleLazyContainersByDefault, @Y61.l EnableRemoveUnknownArgs enableRemoveUnknownArgs, @Y61.l EnableForceNetworkRequestKey enableForceNetworkRequestKey, @Y61.l DisableNewBaseLayoutsIOS disableNewBaseLayoutsIOS) {
            this.f336493a = disableStatePatch;
            this.f336494b = enableStructuredMutable;
            this.f336495c = enableClosestScopePriority;
            this.f336496d = disableScopeContainer;
            this.f336497e = enableStraightResolve;
            this.f336498f = disableEmptyStructureIsNull;
            this.f336499g = enableInternalNavigation;
            this.f336500h = disableCalculationCache;
            this.f336501i = disableCompositionCache;
            this.f336502j = enableRememberRedeclarationCheck;
            this.f336503k = disableComponentStateAutoCapturing;
            this.f336504l = enableTypedPrimitives;
            this.f336505m = enableValuesDestruction;
            this.f336506n = enableSeparatedLayoutParams;
            this.f336507o = enableRecycleLazyContainersByDefault;
            this.f336508p = enableRemoveUnknownArgs;
            this.f336509q = enableForceNetworkRequestKey;
            this.f336510r = disableNewBaseLayoutsIOS;
        }

        public /* synthetic */ a(DisableStatePatch disableStatePatch, EnableStructuredMutable enableStructuredMutable, EnableClosestScopePriority enableClosestScopePriority, DisableScopeContainer disableScopeContainer, EnableStraightResolve enableStraightResolve, DisableEmptyStructureIsNull disableEmptyStructureIsNull, EnableInternalNavigation enableInternalNavigation, DisableCalculationCache disableCalculationCache, DisableCompositionCache disableCompositionCache, EnableRememberRedeclarationCheck enableRememberRedeclarationCheck, DisableComponentStateAutoCapturing disableComponentStateAutoCapturing, EnableTypedPrimitives enableTypedPrimitives, EnableValuesDestruction enableValuesDestruction, EnableSeparatedLayoutParams enableSeparatedLayoutParams, EnableRecycleLazyContainersByDefault enableRecycleLazyContainersByDefault, EnableRemoveUnknownArgs enableRemoveUnknownArgs, EnableForceNetworkRequestKey enableForceNetworkRequestKey, DisableNewBaseLayoutsIOS disableNewBaseLayoutsIOS, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : disableStatePatch, (i12 & 2) != 0 ? null : enableStructuredMutable, (i12 & 4) != 0 ? null : enableClosestScopePriority, (i12 & 8) != 0 ? null : disableScopeContainer, (i12 & 16) != 0 ? null : enableStraightResolve, (i12 & 32) != 0 ? null : disableEmptyStructureIsNull, (i12 & 64) != 0 ? null : enableInternalNavigation, (i12 & 128) != 0 ? null : disableCalculationCache, (i12 & 256) != 0 ? null : disableCompositionCache, (i12 & 512) != 0 ? null : enableRememberRedeclarationCheck, (i12 & 1024) != 0 ? null : disableComponentStateAutoCapturing, (i12 & 2048) != 0 ? null : enableTypedPrimitives, (i12 & 4096) != 0 ? null : enableValuesDestruction, (i12 & 8192) != 0 ? null : enableSeparatedLayoutParams, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : enableRecycleLazyContainersByDefault, (i12 & 32768) != 0 ? null : enableRemoveUnknownArgs, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : enableForceNetworkRequestKey, (i12 & 131072) != 0 ? null : disableNewBaseLayoutsIOS);
        }
    }

    /* compiled from: ScenarioFeatures.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/H$b;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f336511a;

        public b() {
            this(false, 1, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f336511a == ((b) obj).f336511a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f336511a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("Statistics(hasStatePatch="), this.f336511a, ')');
        }

        public b(boolean z12) {
            this.f336511a = z12;
        }

        public /* synthetic */ b(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? true : z12);
        }
    }

    /* compiled from: ScenarioFeatures.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f336512a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f336513b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f336514c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f336515d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f336516e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f336517f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f336518g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f336519h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int[] f336520i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int[] f336521j;

        /* renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ int[] f336522k;

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int[] f336523l;

        /* renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ int[] f336524m;

        /* renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ int[] f336525n;

        /* renamed from: o, reason: collision with root package name */
        public static final /* synthetic */ int[] f336526o;

        /* renamed from: p, reason: collision with root package name */
        public static final /* synthetic */ int[] f336527p;

        /* renamed from: q, reason: collision with root package name */
        public static final /* synthetic */ int[] f336528q;

        static {
            int[] iArr = new int[DisableStatePatch.values().length];
            try {
                DisableStatePatch.a aVar = DisableStatePatch.f336415c;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DisableStatePatch.a aVar2 = DisableStatePatch.f336415c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DisableStatePatch.a aVar3 = DisableStatePatch.f336415c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f336512a = iArr;
            int[] iArr2 = new int[EnableStructuredMutable.values().length];
            try {
                EnableStructuredMutable.a aVar4 = EnableStructuredMutable.f336454c;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EnableStructuredMutable.a aVar5 = EnableStructuredMutable.f336454c;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f336513b = iArr2;
            int[] iArr3 = new int[EnableClosestScopePriority.values().length];
            try {
                EnableClosestScopePriority.a aVar6 = EnableClosestScopePriority.f336420c;
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                EnableClosestScopePriority.a aVar7 = EnableClosestScopePriority.f336420c;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f336514c = iArr3;
            int[] iArr4 = new int[DisableScopeContainer.values().length];
            try {
                DisableScopeContainer.a aVar8 = DisableScopeContainer.f336411c;
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                DisableScopeContainer.a aVar9 = DisableScopeContainer.f336411c;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f336515d = iArr4;
            int[] iArr5 = new int[EnableStraightResolve.values().length];
            try {
                EnableStraightResolve.a aVar10 = EnableStraightResolve.f336450c;
                iArr5[0] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                EnableStraightResolve.a aVar11 = EnableStraightResolve.f336450c;
                iArr5[1] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            f336516e = iArr5;
            int[] iArr6 = new int[DisableEmptyStructureIsNull.values().length];
            try {
                DisableEmptyStructureIsNull.a aVar12 = DisableEmptyStructureIsNull.f336403c;
                iArr6[0] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                DisableEmptyStructureIsNull.a aVar13 = DisableEmptyStructureIsNull.f336403c;
                iArr6[1] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            f336517f = iArr6;
            int[] iArr7 = new int[EnableInternalNavigation.values().length];
            try {
                EnableInternalNavigation.a aVar14 = EnableInternalNavigation.f336428c;
                iArr7[0] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                EnableInternalNavigation.a aVar15 = EnableInternalNavigation.f336428c;
                iArr7[1] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f336518g = iArr7;
            int[] iArr8 = new int[DisableCalculationCache.values().length];
            try {
                DisableCalculationCache.a aVar16 = DisableCalculationCache.f336391c;
                iArr8[0] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                DisableCalculationCache.a aVar17 = DisableCalculationCache.f336391c;
                iArr8[1] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            f336519h = iArr8;
            int[] iArr9 = new int[DisableCompositionCache.values().length];
            try {
                DisableCompositionCache.a aVar18 = DisableCompositionCache.f336399c;
                iArr9[0] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                DisableCompositionCache.a aVar19 = DisableCompositionCache.f336399c;
                iArr9[1] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            f336520i = iArr9;
            int[] iArr10 = new int[EnableRememberRedeclarationCheck.values().length];
            try {
                EnableRememberRedeclarationCheck.a aVar20 = EnableRememberRedeclarationCheck.f336438c;
                iArr10[0] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                EnableRememberRedeclarationCheck.a aVar21 = EnableRememberRedeclarationCheck.f336438c;
                iArr10[1] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            f336521j = iArr10;
            int[] iArr11 = new int[DisableComponentStateAutoCapturing.values().length];
            try {
                DisableComponentStateAutoCapturing.a aVar22 = DisableComponentStateAutoCapturing.f336395c;
                iArr11[0] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                DisableComponentStateAutoCapturing.a aVar23 = DisableComponentStateAutoCapturing.f336395c;
                iArr11[1] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            f336522k = iArr11;
            int[] iArr12 = new int[EnableValuesDestruction.values().length];
            try {
                EnableValuesDestruction.a aVar24 = EnableValuesDestruction.f336464c;
                iArr12[0] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                EnableValuesDestruction.a aVar25 = EnableValuesDestruction.f336464c;
                iArr12[1] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            f336523l = iArr12;
            int[] iArr13 = new int[EnableSeparatedLayoutParams.values().length];
            try {
                EnableSeparatedLayoutParams.a aVar26 = EnableSeparatedLayoutParams.f336446c;
                iArr13[0] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                EnableSeparatedLayoutParams.a aVar27 = EnableSeparatedLayoutParams.f336446c;
                iArr13[1] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            f336524m = iArr13;
            int[] iArr14 = new int[EnableRecycleLazyContainersByDefault.values().length];
            try {
                EnableRecycleLazyContainersByDefault.a aVar28 = EnableRecycleLazyContainersByDefault.f336434c;
                iArr14[0] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                EnableRecycleLazyContainersByDefault.a aVar29 = EnableRecycleLazyContainersByDefault.f336434c;
                iArr14[1] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            f336525n = iArr14;
            int[] iArr15 = new int[EnableRemoveUnknownArgs.values().length];
            try {
                EnableRemoveUnknownArgs.a aVar30 = EnableRemoveUnknownArgs.f336442c;
                iArr15[0] = 1;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                EnableRemoveUnknownArgs.a aVar31 = EnableRemoveUnknownArgs.f336442c;
                iArr15[1] = 2;
            } catch (NoSuchFieldError unused31) {
            }
            f336526o = iArr15;
            int[] iArr16 = new int[EnableForceNetworkRequestKey.values().length];
            try {
                EnableForceNetworkRequestKey.a aVar32 = EnableForceNetworkRequestKey.f336424c;
                iArr16[0] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                EnableForceNetworkRequestKey.a aVar33 = EnableForceNetworkRequestKey.f336424c;
                iArr16[1] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            f336527p = iArr16;
            int[] iArr17 = new int[DisableNewBaseLayoutsIOS.values().length];
            try {
                DisableNewBaseLayoutsIOS.a aVar34 = DisableNewBaseLayoutsIOS.f336407c;
                iArr17[0] = 1;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                DisableNewBaseLayoutsIOS.a aVar35 = DisableNewBaseLayoutsIOS.f336407c;
                iArr17[1] = 2;
            } catch (NoSuchFieldError unused35) {
            }
            f336528q = iArr17;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public H() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h12 = (H) obj;
        return L.f(this.f336474a, h12.f336474a) && L.f(this.f336475b, h12.f336475b);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f336475b.f336511a) + (this.f336474a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "ScenarioFeatures(preferences=" + this.f336474a + ", statistics=" + this.f336475b + ')';
    }

    public H(@Y61.k a aVar, @Y61.k b bVar) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        this.f336474a = aVar;
        this.f336475b = bVar;
        DisableStatePatch disableStatePatch = aVar.f336493a;
        int i12 = disableStatePatch == null ? -1 : c.f336512a[disableStatePatch.ordinal()];
        boolean z28 = false;
        if (i12 == -1) {
            z12 = bVar.f336511a;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (bVar.f336511a) {
                    }
                }
            }
        }
        this.f336476c = z12;
        EnableStructuredMutable enableStructuredMutable = aVar.f336494b;
        int i13 = enableStructuredMutable == null ? -1 : c.f336513b[enableStructuredMutable.ordinal()];
        if (i13 == -1) {
            z13 = false;
        } else if (i13 != 1) {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z13 = false;
        } else {
            z13 = true;
        }
        this.f336477d = z13;
        EnableClosestScopePriority enableClosestScopePriority = aVar.f336495c;
        int i14 = enableClosestScopePriority == null ? -1 : c.f336514c[enableClosestScopePriority.ordinal()];
        if (i14 == -1) {
            z14 = false;
        } else if (i14 != 1) {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z14 = false;
        } else {
            z14 = true;
        }
        this.f336478e = z14;
        DisableScopeContainer disableScopeContainer = aVar.f336496d;
        int i15 = disableScopeContainer == null ? -1 : c.f336515d[disableScopeContainer.ordinal()];
        if (i15 == -1) {
            z15 = false;
        } else if (i15 != 1) {
            if (i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z15 = false;
        } else {
            z15 = true;
        }
        this.f336479f = z15;
        EnableStraightResolve enableStraightResolve = aVar.f336497e;
        int i16 = enableStraightResolve == null ? -1 : c.f336516e[enableStraightResolve.ordinal()];
        if (i16 == -1) {
            z16 = false;
        } else if (i16 != 1) {
            if (i16 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z16 = false;
        } else {
            z16 = true;
        }
        this.f336480g = z16;
        DisableEmptyStructureIsNull disableEmptyStructureIsNull = aVar.f336498f;
        int i17 = disableEmptyStructureIsNull == null ? -1 : c.f336517f[disableEmptyStructureIsNull.ordinal()];
        if (i17 == -1) {
            z17 = false;
        } else if (i17 != 1) {
            if (i17 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z17 = false;
        } else {
            z17 = true;
        }
        this.f336481h = z17;
        EnableInternalNavigation enableInternalNavigation = aVar.f336499g;
        int i18 = enableInternalNavigation == null ? -1 : c.f336518g[enableInternalNavigation.ordinal()];
        if (i18 == -1) {
            z18 = false;
        } else if (i18 != 1) {
            if (i18 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z18 = false;
        } else {
            z18 = true;
        }
        this.f336482i = z18;
        DisableCalculationCache disableCalculationCache = aVar.f336500h;
        int i19 = disableCalculationCache == null ? -1 : c.f336519h[disableCalculationCache.ordinal()];
        if (i19 == -1) {
            z19 = true;
        } else if (i19 != 1) {
            if (i19 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z19 = true;
        } else {
            z19 = false;
        }
        this.f336483j = z19;
        DisableCompositionCache disableCompositionCache = aVar.f336501i;
        int i22 = disableCompositionCache == null ? -1 : c.f336520i[disableCompositionCache.ordinal()];
        if (i22 == -1) {
            z22 = true;
        } else if (i22 != 1) {
            if (i22 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z22 = true;
        } else {
            z22 = false;
        }
        this.f336484k = z22;
        EnableRememberRedeclarationCheck enableRememberRedeclarationCheck = aVar.f336502j;
        int i23 = enableRememberRedeclarationCheck == null ? -1 : c.f336521j[enableRememberRedeclarationCheck.ordinal()];
        if (i23 == -1) {
            z23 = false;
        } else if (i23 != 1) {
            if (i23 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z23 = false;
        } else {
            z23 = true;
        }
        this.f336485l = z23;
        DisableComponentStateAutoCapturing disableComponentStateAutoCapturing = aVar.f336503k;
        int i24 = disableComponentStateAutoCapturing == null ? -1 : c.f336522k[disableComponentStateAutoCapturing.ordinal()];
        if (i24 == -1) {
            z24 = false;
        } else if (i24 != 1) {
            if (i24 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z24 = false;
        } else {
            z24 = true;
        }
        this.f336486m = z24;
        this.f336487n = aVar.f336504l;
        EnableValuesDestruction enableValuesDestruction = aVar.f336505m;
        int i25 = enableValuesDestruction == null ? -1 : c.f336523l[enableValuesDestruction.ordinal()];
        if (i25 == -1) {
            z25 = false;
        } else if (i25 != 1) {
            if (i25 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z25 = false;
        } else {
            z25 = true;
        }
        this.f336488o = z25;
        EnableSeparatedLayoutParams enableSeparatedLayoutParams = aVar.f336506n;
        int i26 = enableSeparatedLayoutParams == null ? -1 : c.f336524m[enableSeparatedLayoutParams.ordinal()];
        if (i26 == -1) {
            z26 = false;
        } else if (i26 != 1) {
            if (i26 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z26 = false;
        } else {
            z26 = true;
        }
        this.f336489p = z26;
        EnableRecycleLazyContainersByDefault enableRecycleLazyContainersByDefault = aVar.f336507o;
        int i27 = enableRecycleLazyContainersByDefault == null ? -1 : c.f336525n[enableRecycleLazyContainersByDefault.ordinal()];
        if (i27 == -1) {
            z27 = false;
        } else if (i27 != 1) {
            if (i27 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z27 = false;
        } else {
            z27 = true;
        }
        this.f336490q = z27;
        EnableRemoveUnknownArgs enableRemoveUnknownArgs = aVar.f336508p;
        int i28 = enableRemoveUnknownArgs == null ? -1 : c.f336526o[enableRemoveUnknownArgs.ordinal()];
        if (i28 != -1) {
            if (i28 == 1) {
                z28 = true;
            } else if (i28 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.f336491r = z28;
        EnableForceNetworkRequestKey enableForceNetworkRequestKey = aVar.f336509q;
        int i29 = enableForceNetworkRequestKey == null ? -1 : c.f336527p[enableForceNetworkRequestKey.ordinal()];
        if (i29 != -1 && i29 != 1 && i29 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        DisableNewBaseLayoutsIOS disableNewBaseLayoutsIOS = aVar.f336510r;
        int i32 = disableNewBaseLayoutsIOS == null ? -1 : c.f336528q[disableNewBaseLayoutsIOS.ordinal()];
        if (i32 != -1 && i32 != 1 && i32 != 2) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ H(com.avito.beduin.v2.engine.H.a r23, com.avito.beduin.v2.engine.H.b r24, int r25, kotlin.jvm.internal.C42822w r26) {
        /*
            r22 = this;
            r0 = r25 & 1
            if (r0 == 0) goto L26
            com.avito.beduin.v2.engine.H$a r0 = new com.avito.beduin.v2.engine.H$a
            r1 = r0
            r20 = 262143(0x3ffff, float:3.6734E-40)
            r21 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L28
        L26:
            r0 = r23
        L28:
            r1 = r25 & 2
            if (r1 == 0) goto L37
            com.avito.beduin.v2.engine.H$b r1 = new com.avito.beduin.v2.engine.H$b
            r2 = 0
            r3 = 0
            r4 = 1
            r1.<init>(r2, r4, r3)
            r2 = r22
            goto L3b
        L37:
            r2 = r22
            r1 = r24
        L3b:
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.engine.H.<init>(com.avito.beduin.v2.engine.H$a, com.avito.beduin.v2.engine.H$b, int, kotlin.jvm.internal.w):void");
    }
}

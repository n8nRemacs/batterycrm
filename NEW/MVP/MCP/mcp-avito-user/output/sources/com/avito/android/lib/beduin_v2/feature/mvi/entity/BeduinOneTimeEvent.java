package com.avito.android.lib.beduin_v2.feature.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.beduin.v2.engine.exception.AbstractBeduinException;
import dU0.InterfaceC39628a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "", "a", "b", "c", "ResultStatus", "d", "ShowToastBar", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent$a;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent$b;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent$c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent$d;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent$ShowToastBar;", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface BeduinOneTimeEvent {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent$ResultStatus;", "", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResultStatus {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ResultStatus[] f176267b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f176268c;

        static {
            ResultStatus[] resultStatusArr = {new ResultStatus("Success", 0), new ResultStatus("Error", 1), new ResultStatus("Cancel", 2)};
            f176267b = resultStatusArr;
            f176268c = kotlin.enums.c.a(resultStatusArr);
        }

        public ResultStatus() {
            throw null;
        }

        public static ResultStatus valueOf(String str) {
            return (ResultStatus) Enum.valueOf(ResultStatus.class, str);
        }

        public static ResultStatus[] values() {
            return (ResultStatus[]) f176267b.clone();
        }
    }

    /* compiled from: BeduinOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent$ShowToastBar;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "a", "Type", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToastBar implements BeduinOneTimeEvent {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f176269a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final a f176270b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Type f176271c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Y41.a<G0> f176272d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: BeduinOneTimeEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent$ShowToastBar$Type;", "", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            /* renamed from: b, reason: collision with root package name */
            public static final Type f176273b;

            /* renamed from: c, reason: collision with root package name */
            public static final Type f176274c;

            /* renamed from: d, reason: collision with root package name */
            public static final Type f176275d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ Type[] f176276e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f176277f;

            static {
                Type type = new Type("DEFAULT", 0);
                f176273b = type;
                Type type2 = new Type("DEFAULT_INVERSE", 1);
                f176274c = type2;
                Type type3 = new Type("ERROR", 2);
                f176275d = type3;
                Type[] typeArr = {type, type2, type3};
                f176276e = typeArr;
                f176277f = kotlin.enums.c.a(typeArr);
            }

            public Type() {
                throw null;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f176276e.clone();
            }
        }

        /* compiled from: BeduinOneTimeEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent$ShowToastBar$a;", "", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f176278a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Y41.a<G0> f176279b;

            public a(@k String str, @l Y41.a<G0> aVar) {
                this.f176278a = str;
                this.f176279b = aVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f176278a, aVar.f176278a) && L.f(this.f176279b, aVar.f176279b);
            }

            public final int hashCode() {
                int iHashCode = this.f176278a.hashCode() * 31;
                Y41.a<G0> aVar = this.f176279b;
                return iHashCode + (aVar == null ? 0 : aVar.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Button(text=");
                sb2.append(this.f176278a);
                sb2.append(", onClick=");
                return r.v(sb2, this.f176279b, ')');
            }
        }

        public ShowToastBar(@k String str, @l a aVar, @k Type type, @l Y41.a<G0> aVar2) {
            this.f176269a = str;
            this.f176270b = aVar;
            this.f176271c = type;
            this.f176272d = aVar2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowToastBar)) {
                return false;
            }
            ShowToastBar showToastBar = (ShowToastBar) obj;
            return L.f(this.f176269a, showToastBar.f176269a) && L.f(this.f176270b, showToastBar.f176270b) && this.f176271c == showToastBar.f176271c && L.f(this.f176272d, showToastBar.f176272d);
        }

        public final int hashCode() {
            int iHashCode = this.f176269a.hashCode() * 31;
            a aVar = this.f176270b;
            int iHashCode2 = (this.f176271c.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
            Y41.a<G0> aVar2 = this.f176272d;
            return iHashCode2 + (aVar2 != null ? aVar2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowToastBar(text=");
            sb2.append(this.f176269a);
            sb2.append(", rightButton=");
            sb2.append(this.f176270b);
            sb2.append(", type=");
            sb2.append(this.f176271c);
            sb2.append(", onDismiss=");
            return r.v(sb2, this.f176272d, ')');
        }
    }

    /* compiled from: BeduinOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent$a;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements BeduinOneTimeEvent {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC39628a f176280a;

        public a(@k InterfaceC39628a interfaceC39628a) {
            this.f176280a = interfaceC39628a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f176280a, ((a) obj).f176280a);
        }

        public final int hashCode() {
            return this.f176280a.hashCode();
        }

        @k
        public final String toString() {
            return "HandleComponentInteraction(componentInteraction=" + this.f176280a + ')';
        }
    }

    /* compiled from: BeduinOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent$b;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements BeduinOneTimeEvent {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final dU0.b f176281a;

        public b(@k dU0.b bVar) {
            this.f176281a = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f176281a, ((b) obj).f176281a);
        }

        public final int hashCode() {
            return this.f176281a.hashCode();
        }

        @k
        public final String toString() {
            return "HandlePlatformInteraction(platformInteraction=" + this.f176281a + ')';
        }
    }

    /* compiled from: BeduinOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent$c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "<init>", "()V", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements BeduinOneTimeEvent {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f176282a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -132682166;
        }

        @k
        public final String toString() {
            return "HandleReload";
        }
    }

    /* compiled from: BeduinOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent$d;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements BeduinOneTimeEvent {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AbstractBeduinException f176283a;

        public d(@k AbstractBeduinException abstractBeduinException) {
            this.f176283a = abstractBeduinException;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f176283a, ((d) obj).f176283a);
        }

        public final int hashCode() {
            return this.f176283a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowErrorToast(exception=" + this.f176283a + ')';
        }
    }
}

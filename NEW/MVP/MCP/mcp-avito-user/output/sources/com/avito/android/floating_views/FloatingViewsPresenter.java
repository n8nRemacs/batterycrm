package com.avito.android.floating_views;

import androidx.appcompat.app.r;
import com.avito.android.floating_views.j;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FloatingViewsPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/floating_views/FloatingViewsPresenter;", "Lcom/avito/android/floating_views/j$a;", "a", "Subscriber", "_avito_floating-views_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface FloatingViewsPresenter extends j.a {

    /* compiled from: FloatingViewsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/floating_views/FloatingViewsPresenter$Subscriber;", "", "DisplayMode", "b", "_avito_floating-views_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Subscriber {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: FloatingViewsPresenter.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/floating_views/FloatingViewsPresenter$Subscriber$DisplayMode;", "", "_avito_floating-views_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DisplayMode {

            /* renamed from: b, reason: collision with root package name */
            public static final DisplayMode f158441b;

            /* renamed from: c, reason: collision with root package name */
            public static final DisplayMode f158442c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ DisplayMode[] f158443d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f158444e;

            static {
                DisplayMode displayMode = new DisplayMode("PARTIALLY", 0);
                f158441b = displayMode;
                DisplayMode displayMode2 = new DisplayMode("COMPLETELY", 1);
                f158442c = displayMode2;
                DisplayMode[] displayModeArr = {displayMode, displayMode2};
                f158443d = displayModeArr;
                f158444e = kotlin.enums.c.a(displayModeArr);
            }

            public DisplayMode() {
                throw null;
            }

            public static DisplayMode valueOf(String str) {
                return (DisplayMode) Enum.valueOf(DisplayMode.class, str);
            }

            public static DisplayMode[] values() {
                return (DisplayMode[]) f158443d.clone();
            }
        }

        /* compiled from: FloatingViewsPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
        }

        /* compiled from: FloatingViewsPresenter.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/floating_views/FloatingViewsPresenter$Subscriber$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/floating_views/FloatingViewsPresenter$Subscriber$b$a;", "Lcom/avito/android/floating_views/FloatingViewsPresenter$Subscriber$b$b;", "_avito_floating-views_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class b {

            /* compiled from: FloatingViewsPresenter.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/floating_views/FloatingViewsPresenter$Subscriber$b$a;", "Lcom/avito/android/floating_views/FloatingViewsPresenter$Subscriber$b;", "_avito_floating-views_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class a extends b {

                /* renamed from: a, reason: collision with root package name */
                public final boolean f158445a;

                public a(boolean z12) {
                    super(null);
                    this.f158445a = z12;
                }

                @Override // com.avito.android.floating_views.FloatingViewsPresenter.Subscriber.b
                /* renamed from: a, reason: from getter */
                public final boolean getF158449d() {
                    return this.f158445a;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && this.f158445a == ((a) obj).f158445a;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f158445a);
                }

                @Y61.k
                public final String toString() {
                    return r.x(new StringBuilder("Hide(animate="), this.f158445a, ')');
                }
            }

            /* compiled from: FloatingViewsPresenter.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/floating_views/FloatingViewsPresenter$Subscriber$b$b;", "Lcom/avito/android/floating_views/FloatingViewsPresenter$Subscriber$b;", "_avito_floating-views_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.floating_views.FloatingViewsPresenter$Subscriber$b$b, reason: collision with other inner class name */
            public static final /* data */ class C4630b extends b {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final DisplayMode f158446a;

                /* renamed from: b, reason: collision with root package name */
                public final boolean f158447b;

                /* renamed from: c, reason: collision with root package name */
                public final boolean f158448c;

                /* renamed from: d, reason: collision with root package name */
                public final boolean f158449d;

                public C4630b(@Y61.k DisplayMode displayMode, boolean z12, boolean z13) {
                    super(null);
                    this.f158446a = displayMode;
                    this.f158447b = z12;
                    this.f158448c = true;
                    this.f158449d = z13;
                }

                @Override // com.avito.android.floating_views.FloatingViewsPresenter.Subscriber.b
                /* renamed from: a, reason: from getter */
                public final boolean getF158449d() {
                    return this.f158449d;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C4630b)) {
                        return false;
                    }
                    C4630b c4630b = (C4630b) obj;
                    return this.f158446a == c4630b.f158446a && this.f158447b == c4630b.f158447b && this.f158448c == c4630b.f158448c && this.f158449d == c4630b.f158449d;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f158449d) + r.i(r.i(this.f158446a.hashCode() * 31, 31, this.f158447b), 31, this.f158448c);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Show(mode=");
                    sb2.append(this.f158446a);
                    sb2.append(", savedSearch=");
                    sb2.append(this.f158447b);
                    sb2.append(", filters=");
                    sb2.append(this.f158448c);
                    sb2.append(", animate=");
                    return r.x(sb2, this.f158449d, ')');
                }
            }

            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            /* renamed from: a */
            public abstract boolean getF158449d();

            public final boolean b() {
                return this instanceof a;
            }

            public b() {
            }
        }

        void i(boolean z12);

        void l(@Y61.k b bVar);
    }

    /* compiled from: FloatingViewsPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/floating_views/FloatingViewsPresenter$a;", "Lcom/avito/android/floating_views/FloatingViewsPresenter$Subscriber;", "_avito_floating-views_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends Subscriber {

        /* compiled from: FloatingViewsPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.floating_views.FloatingViewsPresenter$a$a, reason: collision with other inner class name */
        public static final class C4631a {
        }
    }

    void a();

    void b();

    void c(@Y61.k Subscriber subscriber);

    void d(boolean z12);

    void e(@Y61.l Integer num);

    void g(@Y61.k com.avito.android.ui.adapter.f fVar);
}

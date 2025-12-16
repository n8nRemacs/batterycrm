package com.avito.android.lib.design.checked_text_view;

import Y41.p;
import Y61.k;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;

/* compiled from: AvitoCheckedTextView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/checked_text_view/a;", "Landroidx/appcompat/widget/AppCompatCheckedTextView;", "c", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AppCompatCheckedTextView {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final c f178659f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final AvitoLayoutInflater.c f178660g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final AvitoLayoutInflater.c f178661h;

    /* compiled from: AvitoCheckedTextView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.checked_text_view.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C5260a extends H implements p<Context, AttributeSet, a> {

        /* renamed from: b, reason: collision with root package name */
        public static final C5260a f178662b = new C5260a();

        public C5260a() {
            super(2, a.class, "<init>", "<init>(Landroid/content/Context;Landroid/util/AttributeSet;)V", 0);
        }

        @Override // Y41.p
        public final a invoke(Context context, AttributeSet attributeSet) {
            return new a(context, attributeSet);
        }
    }

    /* compiled from: AvitoCheckedTextView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements p<Context, AttributeSet, a> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f178663b = new b();

        public b() {
            super(2, a.class, "<init>", "<init>(Landroid/content/Context;Landroid/util/AttributeSet;)V", 0);
        }

        @Override // Y41.p
        public final a invoke(Context context, AttributeSet attributeSet) {
            return new a(context, attributeSet);
        }
    }

    /* compiled from: AvitoCheckedTextView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/checked_text_view/a$c;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        AvitoLayoutInflater avitoLayoutInflater = AvitoLayoutInflater.f181382a;
        b bVar = b.f178663b;
        avitoLayoutInflater.getClass();
        f178660g = AvitoLayoutInflater.a(bVar, "CheckedTextView");
        f178661h = AvitoLayoutInflater.a(C5260a.f178662b, AvitoLayoutInflater.f181386e);
    }

    public a(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        super(context, (i12 & 2) != 0 ? null : attributeSet);
    }
}

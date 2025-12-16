package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.gradient.b;
import com.avito.android.util.y6;
import j.InterfaceC42156l;
import kotlin.Metadata;

/* compiled from: StyleBlockGradientDrawable.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/e;", "Lcom/avito/android/lib/design/gradient/b;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/e$a;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.vertical_main.vertical_filter.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34869e extends com.avito.android.lib.design.gradient.b<a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f273529c;

    /* compiled from: StyleBlockGradientDrawable.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/e$a;", "Lcom/avito/android/lib/design/gradient/b$a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.vertical_main.vertical_filter.e$a */
    public static final class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public final int f273530a;

        /* renamed from: b, reason: collision with root package name */
        public final int f273531b;

        public a(@InterfaceC42156l int i12, @InterfaceC42156l int i13) {
            this.f273530a = i12;
            this.f273531b = i13;
        }
    }

    public C34869e(@Y61.k a aVar) {
        this.f273529c = aVar;
    }

    @Override // com.avito.android.lib.design.gradient.b
    public final b.a a() {
        return this.f273529c;
    }

    @Override // com.avito.android.lib.design.gradient.b
    public final Drawable b(b.a aVar) {
        a aVar2 = (a) aVar;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setCornerRadius(y6.b(20));
        gradientDrawable.setColors(new int[]{aVar2.f273530a, aVar2.f273531b});
        return gradientDrawable;
    }
}

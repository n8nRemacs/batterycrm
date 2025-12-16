package com.avito.android.inline_filters.dialog;

import android.content.Context;
import android.os.Parcelable;
import com.avito.android.inline_filters.dialog.E;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: InlineFilterDialog.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/a;", "Lcom/avito/android/inline_filters/dialog/E;", "T", "", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.inline_filters.dialog.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC30998a<T extends E> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.bottom_sheet.d f171146b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public E f171147c;

    public AbstractC30998a(@Y61.l Context context, int i12) {
        this.f171146b = new com.avito.android.lib.design.bottom_sheet.d(context, i12);
    }

    public void a() {
        c();
    }

    @Y61.l
    public Parcelable b() {
        E e12 = this.f171147c;
        if (e12 != null) {
            return e12.getState();
        }
        return null;
    }

    public final void c() {
        this.f171146b.dismiss();
        this.f171147c = null;
    }

    public void d() {
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f171146b;
        com.avito.android.lib.util.g.a(dVar);
        dVar.s();
    }

    public /* synthetic */ AbstractC30998a(Context context, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? 0 : i12);
    }
}

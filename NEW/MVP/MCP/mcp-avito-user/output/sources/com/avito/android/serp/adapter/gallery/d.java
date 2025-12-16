package com.avito.android.serp.adapter.gallery;

import android.view.View;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryHeaderDetailsViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_serp-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f270030a = {m0.f406844a.e(new Y(d.class, "galleryHeaderDetailsViewHolder", "getGalleryHeaderDetailsViewHolder(Landroid/view/View;)Lcom/avito/android/serp/adapter/gallery/GalleryHeaderDetailsViewHolder;", 1))};

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f270031b = new a();

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0003¸\u0006\u0000"}, d2 = {"com/avito/android/util/J6", "Lkotlin/properties/h;", "Landroid/view/View;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements kotlin.properties.h<View, c> {
        @Override // kotlin.properties.g
        public final Object getValue(Object obj, kotlin.reflect.n nVar) {
            Object tag = ((View) obj).getTag(R.id.serp_gallery_header_widget_details);
            if (!(tag instanceof c)) {
                tag = null;
            }
            return (c) tag;
        }

        @Override // kotlin.properties.h
        public final void setValue(View view, kotlin.reflect.n nVar, c cVar) {
            view.setTag(R.id.serp_gallery_header_widget_details, cVar);
        }
    }
}

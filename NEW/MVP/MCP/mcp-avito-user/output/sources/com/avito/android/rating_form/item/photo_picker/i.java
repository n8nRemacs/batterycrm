package com.avito.android.rating_form.item.photo_picker;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.photo_list_view.C33210d;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RatingFormPhotoPickerRedesignBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/item/photo_picker/i;", "LTV0/b;", "Lcom/avito/android/rating_form/item/photo_picker/k;", "Lcom/avito/android/rating_form/item/photo_picker/d;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements TV0.b<k, d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f248539a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C33210d.a f248540b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f248541c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f248542d = new g.a<>(R.layout.rating_form_photo_picker_layout_redesign, new a());

    /* compiled from: RatingFormPhotoPickerRedesignBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/rating_form/item/photo_picker/l;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/rating_form/item/photo_picker/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, l> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final l invoke(ViewGroup viewGroup, View view) {
            return new l(view, i.this.f248540b);
        }
    }

    @Inject
    public i(@Y61.k e eVar, @Y61.k C33210d.a aVar, @com.avito.android.rating_form.di.c boolean z12) {
        this.f248539a = eVar;
        this.f248540b = aVar;
        this.f248541c = z12;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f248539a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f248542d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof d) && this.f248541c;
    }
}

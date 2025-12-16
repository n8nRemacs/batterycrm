package com.avito.android.photo_picker.legacy.details_list;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PreviewBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/legacy/details_list/h;", "LTV0/b;", "Lcom/avito/android/photo_picker/legacy/details_list/n;", "Lcom/avito/android/photo_picker/legacy/thumbnail_list/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements TV0.b<n, com.avito.android.photo_picker.legacy.thumbnail_list.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f219650a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<o> f219651b = new g.a<>(R.layout.preview_item, a.f219652l);

    /* compiled from: PreviewBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/photo_picker/legacy/details_list/o;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/photo_picker/legacy/details_list/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, o> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f219652l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final o invoke(ViewGroup viewGroup, View view) {
            return new o(view);
        }
    }

    public h(@Y61.k i iVar) {
        this.f219650a = iVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f219650a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<o> b() {
        return this.f219651b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof com.avito.android.photo_picker.legacy.thumbnail_list.l;
    }
}

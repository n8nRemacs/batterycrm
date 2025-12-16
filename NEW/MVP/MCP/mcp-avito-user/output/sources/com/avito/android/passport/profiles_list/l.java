package com.avito.android.passport.profiles_list;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfilesListBottomSheetView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profiles_list/l;", "Lcom/avito/android/passport/profiles_list/k;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f213809a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f213810b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Input f213811c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C42670a f213812d;

    /* compiled from: ProfilesListBottomSheetView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<View> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return l.this.f213809a.findViewById(R.id.content_container);
        }
    }

    public l(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.l<? super String, G0> lVar) {
        this.f213809a = view;
        this.f213810b = aVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.profiles_list_bottom_sheet_recycler);
        Input input = (Input) view.findViewById(R.id.profiles_list_bottom_sheet_search);
        this.f213811c = input;
        this.f213812d = new C42670a((ViewGroup) view.findViewById(R.id.progress_container), new a(), 0, 4, null);
        com.avito.android.lib.design.input.n.c(input, lVar);
        recyclerView.setAdapter(jVar);
    }
}

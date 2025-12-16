package com.avito.android.suggest_institutes_bottom_sheet.ui;

import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.publish.screen.objects.view.actions.h;
import com.avito.konveyor.adapter.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: SuggestInstitutesDialogView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/ui/c;", "", "_avito_job_suggest-institutes-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f292096a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<G0> f292097b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f292098c;

    /* renamed from: d, reason: collision with root package name */
    public final Input f292099d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC43160i<CharSequence> f292100e;

    /* compiled from: SuggestInstitutesDialogView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            c.this.f292097b.invoke();
            return G0.f406611a;
        }
    }

    public c(@k View view, @k j jVar, @k com.avito.konveyor.adapter.a aVar, @k Y41.a<G0> aVar2) {
        this.f292096a = aVar;
        this.f292097b = aVar2;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        this.f292098c = recyclerView;
        Input input = (Input) view.findViewById(R.id.input);
        this.f292099d = input;
        this.f292100e = y.a(n.e(input));
        input.setClearButtonListener(new a());
        input.postDelayed(new h(this, 25), 500L);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(jVar);
    }
}

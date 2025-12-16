package com.avito.android.beduin.ui.screen.fragment.tab;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.ui.screen.fragment.tab.BeduinTabFragment;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: BeduinTabFragment.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u001c\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lej/a;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lej/e;", "Lcom/avito/android/beduin_shared/model/component/BeduinComponentItem;", "it", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.common.component.adapter.a f104300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BeduinTabFragment f104301c;

    public d(com.avito.android.beduin.common.component.adapter.a aVar, BeduinTabFragment beduinTabFragment) {
        this.f104300b = aVar;
        this.f104301c = beduinTabFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        final BeduinTabFragment beduinTabFragment = this.f104301c;
        Runnable runnable = new Runnable() { // from class: com.avito.android.beduin.ui.screen.fragment.tab.c
            @Override // java.lang.Runnable
            public final void run() {
                BeduinTabFragment.a aVar = BeduinTabFragment.f104278z0;
                BeduinTabFragment beduinTabFragment2 = beduinTabFragment;
                RecyclerView recyclerViewR5 = beduinTabFragment2.r5();
                n<Object> nVar = BeduinTabFragment.f104277A0[3];
                RecyclerView recyclerView = (RecyclerView) beduinTabFragment2.f104289x0.a();
                D6.l(true, recyclerView, new e(recyclerViewR5, beduinTabFragment2, recyclerView));
            }
        };
        this.f104300b.l((List) obj, runnable);
    }
}

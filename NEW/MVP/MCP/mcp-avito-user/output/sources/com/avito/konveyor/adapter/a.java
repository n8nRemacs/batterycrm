package com.avito.konveyor.adapter;

import Y61.k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdapterPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/konveyor/adapter/a;", "", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: AdapterPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.konveyor.adapter.a$a, reason: collision with other inner class name */
    public static final class C10494a {
    }

    void a(@k RecyclerView.Adapter<b> adapter, @k b bVar);

    int b(int i12);

    void c(@k UV0.a<? extends TV0.a> aVar);

    void d(@k b bVar);

    void e(@k b bVar, int i12, @k List list);

    int getCount();

    long getItemId(int i12);

    boolean isEmpty();
}

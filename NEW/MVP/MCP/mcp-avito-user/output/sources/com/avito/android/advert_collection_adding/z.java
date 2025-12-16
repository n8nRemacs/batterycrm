package com.avito.android.advert_collection_adding;

import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertCollectionAddingViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_adding/z;", "", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.bottom_sheet.d f81954a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f81955b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f81956c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f81957d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Input f81958e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ImageButton f81959f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f81960g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Button f81961h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f81962i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Group f81963j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Group f81964k;

    public z(@Y61.k com.avito.android.lib.design.bottom_sheet.d dVar) {
        this.f81954a = dVar;
        this.f81955b = (TextView) dVar.findViewById(R.id.title);
        this.f81956c = (TextView) dVar.findViewById(R.id.subtitle);
        this.f81957d = (TextView) dVar.findViewById(R.id.warning);
        this.f81958e = (Input) dVar.findViewById(R.id.input);
        this.f81959f = (ImageButton) dVar.findViewById(R.id.close_button);
        this.f81960g = (Button) dVar.findViewById(R.id.create_new_collection_button);
        this.f81961h = (Button) dVar.findViewById(R.id.create_collection_button);
        this.f81962i = (RecyclerView) dVar.findViewById(R.id.content);
        this.f81963j = (Group) dVar.findViewById(R.id.select_collection_group);
        this.f81964k = (Group) dVar.findViewById(R.id.create_collection_group);
    }
}

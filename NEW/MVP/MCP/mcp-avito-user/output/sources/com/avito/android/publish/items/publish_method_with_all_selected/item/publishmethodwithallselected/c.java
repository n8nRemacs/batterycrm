package com.avito.android.publish.items.publish_method_with_all_selected.item.publishmethodwithallselected;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.lib.design.switcher.Switcher;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishMethodOption.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/publish_method_with_all_selected/item/publishmethodwithallselected/c;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f237078a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DockingBadge f237079b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f237080c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Switcher f237081d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f237082e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f237083f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f237084g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final androidx.appcompat.view.d f237085h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<ParameterElement.A.a> f237086i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f237087j;

    public c(@Y61.k View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        this.f237078a = viewGroup;
        View viewFindViewById = viewGroup.findViewById(R.id.badge);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.docking_badge.DockingBadge");
        }
        this.f237079b = (DockingBadge) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f237080c = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.switcher);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.switcher.Switcher");
        }
        this.f237081d = (Switcher) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.description);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f237082e = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.hint);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f237083f = (TextView) viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(R.id.link);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f237084g = (TextView) viewFindViewById6;
        this.f237085h = new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23);
        this.f237086i = new com.jakewharton.rxrelay3.c<>();
        this.f237087j = new com.jakewharton.rxrelay3.c<>();
    }
}

package com.avito.android.verification.inn.list.group_card;

import L91.q;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.verification.inn.list.group_card.GroupCardItem;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GroupCardItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/inn/list/group_card/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f extends com.avito.konveyor.adapter.b {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f324007f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f324008b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f324009c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f324010d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Context f324011e;

    /* compiled from: GroupCardItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[GroupCardItem.State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                GroupCardItem.State state = GroupCardItem.State.f323993b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                GroupCardItem.State state2 = GroupCardItem.State.f323993b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                GroupCardItem.State state3 = GroupCardItem.State.f323993b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public f(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.verification_group_card_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f324008b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.verification_group_card_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f324009c = (TextView) viewFindViewById2;
        this.f324010d = (SimpleDraweeView) view.findViewById(R.id.verification_group_card_image);
        this.f324011e = view.getContext();
        view.setClipToOutline(true);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.itemView.setOnClickListener(new q(12));
    }
}

package com.avito.android.verification.common.list.verification_group;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.verification.common.list.verification_group.VerificationGroupItem;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationGroupItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/common/list/verification_group/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f323469g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f323470b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f323471c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f323472d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f323473e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Context f323474f;

    /* compiled from: VerificationGroupItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[VerificationGroupItem.Status.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                VerificationGroupItem.Status status = VerificationGroupItem.Status.f323454b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                VerificationGroupItem.Status status2 = VerificationGroupItem.Status.f323454b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                VerificationGroupItem.Status status3 = VerificationGroupItem.Status.f323454b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.verification_group_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f323470b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.verification_group_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f323471c = (TextView) viewFindViewById2;
        this.f323472d = (SimpleDraweeView) view.findViewById(R.id.verification_group_image);
        this.f323473e = (ImageView) view.findViewById(R.id.verification_group_icon);
        this.f323474f = view.getContext();
    }
}

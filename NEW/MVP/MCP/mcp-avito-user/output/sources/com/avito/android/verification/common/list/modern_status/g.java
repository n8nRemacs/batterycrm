package com.avito.android.verification.common.list.modern_status;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.verification.common.list.modern_status.ModernStatusItem;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ModernStatusItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/common/list/modern_status/g;", "LJM0/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends JM0.a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f323436g = 0;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f323437c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f323438d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f323439e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Context f323440f;

    /* compiled from: ModernStatusItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ModernStatusItem.Status.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ModernStatusItem.Status status = ModernStatusItem.Status.f323421b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ModernStatusItem.Status status2 = ModernStatusItem.Status.f323421b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ModernStatusItem.Status status3 = ModernStatusItem.Status.f323421b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.verification_modern_status_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f323437c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.verification_modern_status_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f323438d = (TextView) viewFindViewById2;
        this.f323439e = (SimpleDraweeView) view.findViewById(R.id.verification_modern_status_image);
        this.f323440f = view.getContext();
    }
}

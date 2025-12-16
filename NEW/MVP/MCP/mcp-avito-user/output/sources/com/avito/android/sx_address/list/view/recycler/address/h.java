package com.avito.android.sx_address.list.view.recycler.address;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.sx_address.list.domain.AddressItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AddressItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/list/view/recycler/address/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/sx_address/list/view/recycler/address/g;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f293527k = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f293528b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f293529c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f293530d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f293531e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f293532f;

    /* renamed from: g, reason: collision with root package name */
    public final int f293533g;

    /* renamed from: h, reason: collision with root package name */
    public final int f293534h;

    /* renamed from: i, reason: collision with root package name */
    public final int f293535i;

    /* renamed from: j, reason: collision with root package name */
    public final int f293536j;

    /* compiled from: AddressItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[AddressItem.Status.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AddressItem.Status status = AddressItem.Status.f293139b;
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AddressItem.Status status2 = AddressItem.Status.f293139b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AddressItem.Status status3 = AddressItem.Status.f293139b;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AddressItem.Status status4 = AddressItem.Status.f293139b;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public h(@k View view) {
        super(view);
        this.f293528b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f293529c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.address);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f293530d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.address_id);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f293531e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.status);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f293532f = (TextView) viewFindViewById4;
        this.f293533g = C35835l0.d(R.attr.black, view.getContext());
        this.f293534h = C35835l0.d(R.attr.gray48, view.getContext());
        this.f293535i = C35835l0.d(R.attr.orange600, view.getContext());
        this.f293536j = C35835l0.d(R.attr.red600, view.getContext());
    }

    @Override // com.avito.android.sx_address.list.view.recycler.address.g
    public final void UO(@k Y41.a<G0> aVar) {
        this.f293528b.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(2, aVar));
    }

    @Override // com.avito.android.sx_address.list.view.recycler.address.g
    public final void UR(@k String str) {
        I5.a(this.f293530d, str, false);
    }

    @Override // com.avito.android.sx_address.list.view.recycler.address.g
    public final void d10(@k String str) {
        boolean zK2 = C43066x.K(str);
        TextView textView = this.f293531e;
        if (zK2) {
            D6.w(textView);
        } else {
            I5.a(textView, "ID ".concat(str), false);
        }
    }

    @Override // com.avito.android.sx_address.list.view.recycler.address.g
    public final void e80(@k AddressItem.LocalizedStatus localizedStatus, boolean z12) {
        int i12;
        int i13;
        int i14;
        int iOrdinal = localizedStatus.f293136b.ordinal();
        int i15 = this.f293534h;
        if (iOrdinal == 0 || iOrdinal == 1) {
            i12 = this.f293533g;
            i13 = i15;
        } else {
            if (iOrdinal == 2) {
                i14 = this.f293535i;
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = this.f293533g;
                i13 = i15;
            } else {
                i14 = this.f293536j;
            }
            i13 = i14;
            i12 = i15;
        }
        if (!z12) {
            i15 = i12;
        }
        this.f293529c.setTextColor(i15);
        this.f293530d.setTextColor(i15);
        TextView textView = this.f293532f;
        I5.a(textView, localizedStatus.f293137c, false);
        textView.setTextColor(i13);
        I5.e(textView, null, Integer.valueOf(i13), 11);
    }

    @Override // com.avito.android.sx_address.list.view.recycler.address.g
    public final void iO(@k String str) {
        I5.a(this.f293529c, str, false);
    }
}

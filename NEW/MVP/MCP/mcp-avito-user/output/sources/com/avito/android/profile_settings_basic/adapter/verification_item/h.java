package com.avito.android.profile_settings_basic.adapter.verification_item;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.profile_settings_basic.adapter.verification_item.VerificationItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import j.InterfaceC42150f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_basic/adapter/verification_item/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_basic/adapter/verification_item/g;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f228727g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f228728b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f228729c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f228730d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f228731e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Context f228732f;

    /* compiled from: VerificationItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[VerificationItem.Status.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                VerificationItem.Status.a aVar = VerificationItem.Status.f228713b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                VerificationItem.Status.a aVar2 = VerificationItem.Status.f228713b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.verification_item_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f228728b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f228729c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f228730d = (TextView) viewFindViewById3;
        this.f228731e = (ImageView) view.findViewById(R.id.icon);
        this.f228732f = view.getContext();
    }

    public final void B80(@InterfaceC42150f Integer num) {
        this.f228731e.setImageDrawable(num != null ? C35835l0.h(num.intValue(), this.f228732f) : null);
    }

    public final void C80(@InterfaceC42150f Integer num) {
        this.f228731e.setImageTintList(num != null ? C35835l0.e(num.intValue(), this.f228732f) : null);
    }

    @Override // com.avito.android.profile_settings_basic.adapter.verification_item.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f228728b.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(3, aVar));
    }

    @Override // com.avito.android.profile_settings_basic.adapter.verification_item.g
    public final void z30(@k VerificationItem verificationItem) {
        I5.a(this.f228729c, verificationItem.f228709c, false);
        TextView textView = this.f228730d;
        I5.a(textView, verificationItem.f228710d, false);
        int iOrdinal = verificationItem.f228711e.ordinal();
        Context context = this.f228732f;
        if (iOrdinal == 0) {
            B80(Integer.valueOf(R.attr.ic_time20));
            C80(Integer.valueOf(R.attr.blue700));
            textView.setTextColor(C35835l0.d(R.attr.gray54, context));
        } else if (iOrdinal == 1) {
            B80(Integer.valueOf(R.attr.ic_attentionRound20));
            C80(Integer.valueOf(R.attr.red));
            textView.setTextColor(C35835l0.d(R.attr.red, context));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            B80(null);
            C80(null);
            textView.setTextColor(C35835l0.d(R.attr.gray54, context));
        }
    }
}

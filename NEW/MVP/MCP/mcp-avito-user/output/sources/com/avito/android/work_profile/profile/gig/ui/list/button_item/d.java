package com.avito.android.work_profile.profile.gig.ui.list.button_item;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.verification.verification_input_inn.o;
import com.avito.android.work_profile.profile.gig.ui.list.button_item.GigButtonItem;
import com.avito.android.work_profile.profile.gig.ui.list.button_item.c;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: GigButtonPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work_profile/profile/gig/ui/list/button_item/d;", "LTV0/d;", "Lcom/avito/android/work_profile/profile/gig/ui/list/button_item/c;", "Lcom/avito/android/work_profile/profile/gig/ui/list/button_item/GigButtonItem;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements TV0.d<c, GigButtonItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f331224b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super DeepLink, G0> lVar) {
        this.f331224b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        int iJ2;
        int iJ3;
        c cVar = (c) eVar;
        GigButtonItem gigButtonItem = (GigButtonItem) aVar;
        Button button = cVar.f331218e;
        button.setImageDrawable(null);
        ImageView imageView = cVar.f331217d;
        imageView.setImageDrawable(null);
        GigButtonItem.Status status = gigButtonItem.f331196h;
        String str = gigButtonItem.f331194f;
        if (str != null) {
            imageView.setVisibility(0);
            ImageRequest.a aVar2 = new ImageRequest.a(new DM.a(imageView));
            aVar2.f(Uri.parse(str));
            aVar2.c();
        } else {
            GigButtonItem.IconType iconType = gigButtonItem.f331193e;
            if (iconType != null) {
                int iOrdinal = iconType.ordinal();
                if (iOrdinal == 0) {
                    imageView.setVisibility(0);
                    Context context = imageView.getContext();
                    int iOrdinal2 = iconType.ordinal();
                    if (iOrdinal2 == 0) {
                        iJ2 = C35835l0.j(R.attr.ic_sbp24, context);
                    } else {
                        if (iOrdinal2 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iJ2 = C35835l0.j(R.attr.ic_card24, context);
                    }
                    imageView.setImageResource(iJ2);
                } else if (iOrdinal == 1) {
                    button.setVisibility(0);
                    Context context2 = button.getContext();
                    int iOrdinal3 = iconType.ordinal();
                    if (iOrdinal3 == 0) {
                        iJ3 = C35835l0.j(R.attr.ic_sbp24, context2);
                    } else {
                        if (iOrdinal3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iJ3 = C35835l0.j(R.attr.ic_card24, context2);
                    }
                    button.setImageResource(iJ3);
                }
            } else if (status != null) {
                button.setVisibility(0);
                int iOrdinal4 = status.ordinal();
                Context context3 = cVar.f331215b;
                if (iOrdinal4 == 0) {
                    cVar.B80(R.color.black);
                    button.setImageResource(C35835l0.j(R.attr.ic_plus16, context3));
                } else if (iOrdinal4 == 1) {
                    cVar.B80(R.color.black);
                    button.setImageResource(C35835l0.j(R.attr.ic_checkRound16, context3));
                } else if (iOrdinal4 == 2) {
                    cVar.B80(R.color.common_red_600);
                    button.setImageResource(C35835l0.j(R.attr.ic_attentionRound16, context3));
                } else if (iOrdinal4 == 3) {
                    cVar.B80(R.color.common_blue_700);
                    button.setImageResource(C35835l0.j(R.attr.ic_time16, context3));
                } else if (iOrdinal4 == 4) {
                    cVar.B80(R.color.common_orange_700);
                    button.setImageResource(C35835l0.j(R.attr.ic_time16, context3));
                } else if (iOrdinal4 == 5) {
                    cVar.B80(R.color.common_gray_36);
                    button.setImageResource(C35835l0.j(R.attr.ic_plus16, context3));
                }
            } else {
                button.setVisibility(8);
            }
        }
        switch (status == null ? -1 : c.a.f331223a[status.ordinal()]) {
            case 1:
                cVar.C80(R.color.common_gray_54);
                break;
            case 2:
                cVar.C80(R.color.common_blue_700);
                break;
            case 3:
                cVar.C80(R.color.common_gray_54);
                break;
            case 4:
                cVar.C80(R.color.common_red_600);
                break;
            case 5:
                cVar.C80(R.color.common_orange_700);
                break;
            case 6:
                cVar.C80(R.color.common_gray_54);
                break;
            default:
                cVar.C80(R.color.common_gray_54);
                break;
        }
        cVar.f331219f.setText(gigButtonItem.f331190b);
        cVar.f331220g.setText(gigButtonItem.f331191c);
        DeepLink deepLink = gigButtonItem.f331192d;
        String str2 = gigButtonItem.f331195g;
        ImageView imageView2 = cVar.f331222i;
        TextView textView = cVar.f331221h;
        if (str2 == null) {
            imageView2.setVisibility(deepLink == null ? 8 : 0);
            textView.setVisibility(8);
        } else {
            textView.setText(str2);
            imageView2.setVisibility(8);
            textView.setVisibility(0);
        }
        ViewGroup viewGroup = cVar.f331216c;
        if (deepLink != null) {
            viewGroup.setOnClickListener(new o(11, this.f331224b, gigButtonItem));
        } else {
            viewGroup.setOnClickListener(null);
        }
    }
}

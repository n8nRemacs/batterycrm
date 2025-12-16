package com.avito.android.user_address.list;

import XG0.a;
import XG0.c;
import Y41.l;
import android.net.Uri;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.user_address.NavigationController;
import com.avito.android.user_address.UserAddressActivity;
import com.avito.android.user_address.list.UserAddressListFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: UserAddressListFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class a extends H implements l<XG0.c, G0> {
    @Override // Y41.l
    public final G0 invoke(XG0.c cVar) {
        UserAddressLink.Result.Success modified;
        Button button;
        com.avito.android.user_address.list.view.d dVar;
        com.avito.android.lib.design.bottom_sheet.d dVar2;
        final int i12 = 1;
        final int i13 = 0;
        XG0.c cVar2 = cVar;
        UserAddressListFragment userAddressListFragment = (UserAddressListFragment) this.receiver;
        UserAddressListFragment.a aVar = UserAddressListFragment.f307300z0;
        userAddressListFragment.getClass();
        if (cVar2 instanceof c.g) {
            ((com.avito.android.user_address.g) userAddressListFragment.requireActivity()).o1(null, UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode.f307183c, null);
        } else if (cVar2 instanceof c.e) {
            com.avito.android.user_address.list.view.d dVar3 = userAddressListFragment.f307311x0;
            if (dVar3 != null) {
                dVar3.a();
            }
        } else if (cVar2 instanceof c.h) {
            final com.avito.android.user_address.list.view.d dVar4 = userAddressListFragment.f307311x0;
            if (dVar4 != null) {
                c.h hVar = (c.h) cVar2;
                com.avito.android.lib.design.bottom_sheet.d dVar5 = dVar4.f307444j;
                if (dVar5 != null) {
                    Button button2 = (Button) dVar5.findViewById(R.id.accept);
                    final int i14 = hVar.f18797a;
                    button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.user_address.list.view.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            d dVar6 = dVar4;
                            int i15 = i14;
                            switch (i13) {
                                case 0:
                                    int i16 = d.f307434s;
                                    dVar6.f307435a.accept(new a.b(true, i15));
                                    break;
                                default:
                                    int i17 = d.f307434s;
                                    dVar6.f307435a.accept(new a.b(false, i15));
                                    break;
                            }
                        }
                    });
                    ((Button) dVar5.findViewById(R.id.decline)).setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.user_address.list.view.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            d dVar6 = dVar4;
                            int i15 = i14;
                            switch (i12) {
                                case 0:
                                    int i16 = d.f307434s;
                                    dVar6.f307435a.accept(new a.b(true, i15));
                                    break;
                                default:
                                    int i17 = d.f307434s;
                                    dVar6.f307435a.accept(new a.b(false, i15));
                                    break;
                            }
                        }
                    });
                    com.avito.android.lib.util.g.a(dVar5);
                }
            }
        } else if (cVar2 instanceof c.C1325c) {
            ((com.avito.android.user_address.g) userAddressListFragment.requireActivity()).Q(UserAddressLink.Result.Success.DefaultChanged.f133816b);
        } else if (cVar2 instanceof c.b) {
            com.avito.android.user_address.list.view.d dVar6 = userAddressListFragment.f307311x0;
            if (dVar6 != null && (dVar2 = dVar6.f307444j) != null) {
                Button button3 = (Button) dVar2.findViewById(R.id.accept);
                button3.setLoading(true);
                button3.setClickable(false);
            }
        } else if (cVar2 instanceof c.a) {
            Toolbar toolbar = userAddressListFragment.f307310w0;
            if (toolbar != null && (dVar = userAddressListFragment.f307311x0) != null) {
                com.avito.android.component.toast.c cVar3 = com.avito.android.component.toast.c.f125244a;
                StringBuilder sb2 = new StringBuilder();
                e eVar = dVar.f307438d;
                sb2.append(eVar.getF307371f());
                sb2.append('\n');
                sb2.append(eVar.getF307372g());
                com.avito.android.component.toast.c.b(cVar3, toolbar, com.avito.android.printable_text.b.f(sb2.toString()), null, null, null, new f.c(((c.a) cVar2).f18790a), 0, ToastBarPosition.f181045c, null, false, false, null, null, 4014);
            }
        } else if (cVar2 instanceof c.f) {
            ((com.avito.android.user_address.g) userAddressListFragment.requireActivity()).z(new UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ById(((c.f) cVar2).f18795a, null, NavigationController.Mode.f307099c, true));
        } else if (cVar2 instanceof c.i) {
            WebViewLink.OnlyAvitoDomain onlyAvitoDomain = new WebViewLink.OnlyAvitoDomain(Uri.parse("https://support.avito.ru/articles/2932"), null, null, 6, null);
            com.avito.android.deeplink_handler.handler.composite.a aVar2 = userAddressListFragment.f307306s0;
            if (aVar2 == null) {
                aVar2 = null;
            }
            b.a.a(aVar2, onlyAvitoDomain, null, null, 6);
        } else if (cVar2 instanceof c.j) {
            com.avito.android.user_address.g gVar = (com.avito.android.user_address.g) userAddressListFragment.requireActivity();
            UserAddressLink.Result.Success.DefaultChanged.f133816b.getClass();
            UserAddressLink.Result.Success success = ((c.j) cVar2).f18799a;
            if (success instanceof UserAddressLink.Result.Success.Added) {
                UserAddressLink.Result.Success.Added added = (UserAddressLink.Result.Success.Added) success;
                modified = new UserAddressLink.Result.Success.Added(false, added.f133809c, added.f133810d, added.f133811e, added.f133812f, added.f133813g, added.f133814h, added.f133815i);
            } else if (success instanceof UserAddressLink.Result.Success.Delete) {
                UserAddressLink.Result.Success.Delete delete = (UserAddressLink.Result.Success.Delete) success;
                modified = new UserAddressLink.Result.Success.Delete(delete.f133818c, delete.f133819d, delete.f133820e, false);
            } else if (success instanceof UserAddressLink.Result.Success.Modified) {
                UserAddressLink.Result.Success.Modified modified2 = (UserAddressLink.Result.Success.Modified) success;
                modified = new UserAddressLink.Result.Success.Modified(false, modified2.f133822c, modified2.f133823d, modified2.f133824e, modified2.f133825f, modified2.f133826g, modified2.f133827h, modified2.f133828i);
            } else {
                modified = success;
            }
            gVar.Q(modified);
            com.avito.android.user_address.list.view.d dVar7 = userAddressListFragment.f307311x0;
            if (dVar7 != null && (button = dVar7.f307445k) != null) {
                com.avito.android.user_address.e.a(button, success);
            }
        } else if (cVar2 instanceof c.d) {
            ((com.avito.android.user_address.g) userAddressListFragment.requireActivity()).Q(((c.d) cVar2).f18793a);
            ((com.avito.android.user_address.g) userAddressListFragment.requireActivity()).u0();
        }
        return G0.f406611a;
    }
}

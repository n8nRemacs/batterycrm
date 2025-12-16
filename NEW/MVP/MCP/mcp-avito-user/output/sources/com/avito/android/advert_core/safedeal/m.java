package com.avito.android.advert_core.safedeal;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.remote.model.MyAdvertSafeDeal;
import com.avito.android.util.D6;
import com.avito.android.util.V2;
import com.jakewharton.rxbinding4.view.C37722i;
import java.util.Iterator;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MyAdvertSafeDealServicesView.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/remote/model/MyAdvertSafeDeal;", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/G0;", "invoke", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class m extends N implements Y41.l<Q<? extends MyAdvertSafeDeal, ? extends Set<? extends String>>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f84223l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h hVar) {
        super(1);
        this.f84223l = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(Q<? extends MyAdvertSafeDeal, ? extends Set<? extends String>> q12) {
        G0 g02;
        Q<? extends MyAdvertSafeDeal, ? extends Set<? extends String>> q13 = q12;
        MyAdvertSafeDeal myAdvertSafeDeal = (MyAdvertSafeDeal) q13.f406619b;
        Set set = (Set) q13.f406620c;
        h hVar = this.f84223l;
        int childCount = hVar.f84206a.getChildCount();
        ViewGroup viewGroup = hVar.f84206a;
        if (childCount > 0) {
            viewGroup.removeAllViews();
        }
        Iterator<T> it = myAdvertSafeDeal.getServices().iterator();
        while (it.hasNext()) {
            Parcelable content = ((MyAdvertSafeDeal.Service) it.next()).getContent();
            boolean z12 = content instanceof MyAdvertSafeDeal.Service.Content.ListItem;
            LayoutInflater layoutInflater = hVar.f84210e;
            if (z12) {
                View viewInflate = layoutInflater.inflate(R.layout.safedeal_service_item, viewGroup, false);
                ListItemSwitcher listItemSwitcher = (ListItemSwitcher) viewInflate;
                View viewFindViewById = listItemSwitcher.findViewById(R.id.design_item_switcher);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
                D6.g(viewFindViewById);
                h.a(hVar, listItemSwitcher, (MyAdvertSafeDeal.Service.TextWithLinkContent) content);
                Integer numB = h.b(((MyAdvertSafeDeal.Service.Content.ListItem) content).getIconType());
                if (numB != null) {
                    listItemSwitcher.setImageResource(numB.intValue());
                }
                viewGroup.addView(viewInflate);
            } else {
                if (content instanceof MyAdvertSafeDeal.Service.Content.Switcher) {
                    MyAdvertSafeDeal.Service.Content.Switcher switcher = (MyAdvertSafeDeal.Service.Content.Switcher) content;
                    String id2 = switcher.getId();
                    if (id2 != null) {
                        View viewInflate2 = layoutInflater.inflate(R.layout.safedeal_service_item, viewGroup, false);
                        ListItemSwitcher listItemSwitcher2 = (ListItemSwitcher) viewInflate2;
                        listItemSwitcher2.setTag(id2);
                        h.a(hVar, listItemSwitcher2, (MyAdvertSafeDeal.Service.TextWithLinkContent) content);
                        Integer numB2 = h.b(switcher.getIconType());
                        if (numB2 != null) {
                            listItemSwitcher2.setImageResource(numB2.intValue());
                        }
                        listItemSwitcher2.setChecked(set.contains(id2));
                        C37722i.a(listItemSwitcher2).N(new k(hVar, id2)).t0(new l(hVar, id2, listItemSwitcher2));
                        viewGroup.addView(viewInflate2);
                        hVar.f84211f.put(id2, listItemSwitcher2);
                        g02 = G0.f406611a;
                    } else {
                        g02 = null;
                    }
                    if (g02 == null) {
                        V2.f318762a.e("SafeDeal switcher has no id", null);
                    }
                } else if (content instanceof MyAdvertSafeDeal.Service.Content.ClickableListItem) {
                    MyAdvertSafeDeal.Service.Content.ClickableListItem clickableListItem = (MyAdvertSafeDeal.Service.Content.ClickableListItem) content;
                    View viewInflate3 = layoutInflater.inflate(R.layout.safedeal_service_list_item, viewGroup, false);
                    ListItem listItem = (ListItem) viewInflate3;
                    listItem.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    listItem.setAppearanceFromAttr(R.attr.listItemGraySubtitle);
                    listItem.setTitle(clickableListItem.getTitle());
                    listItem.setSubtitle(clickableListItem.getSubtitle());
                    MyAdvertSafeDeal.Service.Content.Icon leftIcon = clickableListItem.getLeftIcon();
                    Integer numB3 = h.b(leftIcon != null ? leftIcon.getIconType() : null);
                    MyAdvertSafeDeal.Service.Content.Icon rightIcon = clickableListItem.getRightIcon();
                    Integer numB4 = h.b(rightIcon != null ? rightIcon.getIconType() : null);
                    listItem.j(numB3 != null ? numB3.intValue() : 0, numB4 != null ? numB4.intValue() : 0);
                    listItem.setClickable(true);
                    C37722i.a(listItem).t0(new i(hVar, clickableListItem));
                    viewGroup.addView(viewInflate3);
                } else {
                    V2.f318762a.e("Need to handle new type of safeDeal services from json", null);
                }
            }
        }
        return G0.f406611a;
    }
}

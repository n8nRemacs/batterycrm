package com.avito.android.advert_item_actions.view;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.HideAction;
import com.avito.android.remote.model.ItemAction;
import com.avito.android.util.I5;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ActionsBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_item_actions/view/e;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_advert-item-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ int f85861F = 0;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final InterfaceC42726C f85862E;

    /* compiled from: ActionsBottomSheet.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/ItemAction;", "action", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/ItemAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<ItemAction, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<String, G0> f85863l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super String, G0> lVar) {
            super(1);
            this.f85863l = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(ItemAction itemAction) {
            ItemAction itemAction2 = itemAction;
            if (itemAction2 instanceof HideAction) {
                this.f85863l.invoke(((HideAction) itemAction2).getLabel());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ActionsBottomSheet.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/remote/model/ItemAction;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<List<ItemAction>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Context f85864l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.f85864l = context;
        }

        @Override // Y41.a
        public final List<ItemAction> invoke() throws Resources.NotFoundException {
            Context context = this.f85864l;
            String[] stringArray = context.getResources().getStringArray(R.array.hide_recommendation_action_titles);
            String[] stringArray2 = context.getResources().getStringArray(R.array.hide_recommendation_action_types);
            ArrayList arrayList = new ArrayList();
            int length = stringArray.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                arrayList.add(new HideAction(stringArray2[i13], stringArray[i12], false));
                i12++;
                i13++;
            }
            return arrayList;
        }
    }

    public e(@k Context context, @Y61.l String str, @Y61.l List<? extends ItemAction> list, @k l<? super String, G0> lVar, @k Y41.a<G0> aVar) throws Resources.NotFoundException {
        super(context, 0, 2, null);
        InterfaceC42726C interfaceC42726CC = C42727D.c(new b(context));
        this.f85862E = interfaceC42726CC;
        boolean z12 = context.getResources().getBoolean(R.bool.is_tablet);
        TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.advert_actions_custom_header, (ViewGroup) null);
        D(R.layout.advert_actions_menu, true);
        H(textView);
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, !z12, 7);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.action_items_container);
        I5.a(textView, str == null ? context.getString(R.string.hide_recommendation) : str, false);
        setOnDismissListener(new d(0, aVar));
        f fVar = new f(viewGroup);
        list = list == null ? (List) interfaceC42726CC.getValue() : list;
        fVar.f85867c = new a(lVar);
        fVar.c(fVar.f85865a, list);
    }
}

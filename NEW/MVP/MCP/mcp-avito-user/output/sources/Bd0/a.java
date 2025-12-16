package BD0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff_lf_constructor.configure.setting.items.model.ConfigureAttributeModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ConstructorSettingDiffUtilCallback.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LBD0/a;", "Landroidx/recyclerview/widget/o$b;", "a", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends C23424o.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f1247a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f1248b;

    /* compiled from: ConstructorSettingDiffUtilCallback.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"LBD0/a$a;", "", "<init>", "()V", "", "PAYLOAD_CONSTRUCTOR_SETTING_BONUS", "Ljava/lang/String;", "PAYLOAD_CONSTRUCTOR_SETTING_DISCOUNT", "PAYLOAD_CONSTRUCTOR_SETTING_LEVEL_PRICE", "PAYLOAD_CONSTRUCTOR_SETTING_LOADING", "PAYLOAD_CONSTRUCTOR_SETTING_PACKAGES_PRICE", "PAYLOAD_CONSTRUCTOR_SETTING_TOTAL_PRICE", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: BD0.a$a, reason: collision with other inner class name */
    public static final class C0048a {
        public /* synthetic */ C0048a(C42822w c42822w) {
            this();
        }

        public C0048a() {
        }
    }

    static {
        new C0048a(null);
    }

    public a(@k ArrayList arrayList, @k List list) {
        this.f1247a = list;
        this.f1248b = arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areContentsTheSame(int i12, int i13) {
        com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) this.f1247a.get(i12);
        com.avito.conveyor_item.a aVar2 = (com.avito.conveyor_item.a) this.f1248b.get(i13);
        if ((aVar2 instanceof com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.a) && (aVar instanceof com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.a)) {
            if (((com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.a) aVar2).getF75535g() == ((com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.a) aVar).getF75535g()) {
                com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.a aVar3 = (com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.a) aVar2;
                com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.a aVar4 = (com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.a) aVar;
                if (aVar3.f300109j == aVar4.f300109j && L.f(aVar3.f300103d, aVar4.f300103d) && L.f(aVar3.f300108i, aVar4.f300108i)) {
                    return true;
                }
            }
        } else {
            if ((aVar2 instanceof com.avito.android.tariff_lf_constructor.configure.setting.items.placing.a) && (aVar instanceof com.avito.android.tariff_lf_constructor.configure.setting.items.placing.a)) {
                return L.f(((com.avito.android.tariff_lf_constructor.configure.setting.items.placing.a) aVar2).f300089b.getDeeplink(), ((com.avito.android.tariff_lf_constructor.configure.setting.items.placing.a) aVar).f300089b.getDeeplink());
            }
            if ((aVar2 instanceof com.avito.android.tariff_lf_constructor.configure.header_item.a) && (aVar instanceof com.avito.android.tariff_lf_constructor.configure.header_item.a)) {
                com.avito.android.tariff_lf_constructor.configure.header_item.a aVar5 = (com.avito.android.tariff_lf_constructor.configure.header_item.a) aVar2;
                com.avito.android.tariff_lf_constructor.configure.header_item.a aVar6 = (com.avito.android.tariff_lf_constructor.configure.header_item.a) aVar;
                if (L.f(aVar5.f299615c, aVar6.f299615c) && L.f(aVar5.f299616d, aVar6.f299616d)) {
                    return true;
                }
            } else if ((aVar2 instanceof com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.c) && (aVar instanceof com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.c)) {
                return L.f(aVar2, aVar);
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areItemsTheSame(int i12, int i13) {
        ?? r02 = this.f1247a;
        com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) r02.get(i12);
        ArrayList arrayList = this.f1248b;
        com.avito.conveyor_item.a aVar2 = (com.avito.conveyor_item.a) arrayList.get(i13);
        if (!(aVar2 instanceof com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.c) || !(aVar instanceof com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.c)) {
            return L.f(((com.avito.conveyor_item.a) r02.get(i12)).getF75536h(), ((com.avito.conveyor_item.a) arrayList.get(i13)).getF75536h());
        }
        ((com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.c) aVar2).getClass();
        ((com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.c) aVar).getClass();
        com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.c cVar = (com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.c) aVar2;
        com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.c cVar2 = (com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.c) aVar;
        return L.f(cVar.f300147f, cVar2.f300147f) && L.f(cVar.f300145d, cVar2.f300145d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.C23424o.b
    @l
    public final Object getChangePayload(int i12, int i13) {
        boolean z12;
        com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) this.f1247a.get(i12);
        com.avito.conveyor_item.a aVar2 = (com.avito.conveyor_item.a) this.f1248b.get(i13);
        Bundle bundle = new Bundle();
        if ((aVar2 instanceof com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.c) && (aVar instanceof com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.c)) {
            com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.c cVar = (com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.c) aVar2;
            com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.c cVar2 = (com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.c) aVar;
            if (!L.f(cVar.f300147f, cVar2.f300147f)) {
                bundle.putParcelable("totalPrice", cVar.f300147f);
            }
            AttributedText attributedText = cVar.f300148g;
            if (!L.f(attributedText, cVar2.f300148g)) {
                bundle.putParcelable("bonus", attributedText);
            }
            ConfigureAttributeModel configureAttributeModel = cVar.f300146e;
            if (!L.f(configureAttributeModel, cVar2.f300146e)) {
                bundle.putParcelable("levelPrice", configureAttributeModel);
            }
            ConfigureAttributeModel configureAttributeModel2 = cVar.f300145d;
            if (!L.f(configureAttributeModel2, cVar2.f300145d)) {
                bundle.putParcelable("packagesPrice", configureAttributeModel2);
            }
            ConfigureAttributeModel configureAttributeModel3 = cVar.f300144c;
            if (!L.f(configureAttributeModel3, cVar2.f300144c)) {
                bundle.putParcelable("discount", configureAttributeModel3);
            }
        } else if ((aVar2 instanceof com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.a) && (aVar instanceof com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.a) && (z12 = ((com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.a) aVar2).f300109j) != ((com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.a) aVar).f300109j) {
            bundle.putBoolean("loading", z12);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getNewListSize() {
        return this.f1248b.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getOldListSize() {
        return this.f1247a.size();
    }
}

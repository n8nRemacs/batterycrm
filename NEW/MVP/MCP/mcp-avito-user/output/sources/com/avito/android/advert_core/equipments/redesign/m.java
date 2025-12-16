package com.avito.android.advert_core.equipments.redesign;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.AdvertEquipments;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import x9.InterfaceC49794a;

/* compiled from: RedesignedEquipmentsOptionsFormatter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/equipments/redesign/m;", "Lcom/avito/android/advert_core/equipments/redesign/l;", "a", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49794a f83556a;

    /* compiled from: RedesignedEquipmentsOptionsFormatter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/advert_core/equipments/redesign/m$a;", "", "<init>", "()V", "", "BREAK_SPACE", "C", "", "EQUIPMENTS_BLOCK_OPTIONS_LIMIT", "I", "EQUIPMENTS_BLOCK_OPTION_TITLE_DELIMITER", "", "EQUIPMENTS_BLOCK_OPTION_VALUES_DELIMITER", "Ljava/lang/String;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public m(@Y61.k InterfaceC49794a interfaceC49794a) {
        this.f83556a = interfaceC49794a;
    }

    @Override // com.avito.android.advert_core.equipments.redesign.l
    @Y61.l
    public final ArrayList a(@Y61.l List list, @Y61.l Boolean bool) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<AdvertEquipments.EquipmentOption> listE0 = C42745f0.E0(list, 3);
        ArrayList arrayList = new ArrayList(C42745f0.q(listE0, 10));
        for (AdvertEquipments.EquipmentOption equipmentOption : listE0) {
            String str = equipmentOption.getTitle() + ':';
            SpannableString spannableString = new SpannableString(str);
            boolean zF2 = L.f(bool, Boolean.TRUE);
            InterfaceC49794a interfaceC49794a = this.f83556a;
            spannableString.setSpan(new ForegroundColorSpan(zF2 ? interfaceC49794a.e() : interfaceC49794a.a()), 0, str.length(), 33);
            StringBuilder sb2 = new StringBuilder();
            int i12 = 0;
            for (Object obj : equipmentOption.getValues()) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                String strQ = (String) obj;
                if (i12 < C42745f0.J(equipmentOption.getValues())) {
                    strQ = r.q(strQ, ", ");
                }
                sb2.append(strQ);
                i12 = i13;
            }
            SpannableString spannableString2 = new SpannableString(sb2);
            spannableString2.setSpan(new ForegroundColorSpan(L.f(bool, Boolean.TRUE) ? interfaceC49794a.e() : interfaceC49794a.f()), 0, sb2.length(), 33);
            arrayList.add(new SpannableStringBuilder().append((CharSequence) spannableString).append(' ').append((CharSequence) spannableString2));
        }
        return arrayList;
    }
}

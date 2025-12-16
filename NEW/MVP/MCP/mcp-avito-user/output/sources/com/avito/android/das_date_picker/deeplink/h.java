package com.avito.android.das_date_picker.deeplink;

import Ju.InterfaceC14249c;
import com.avito.android.das_date_picker.deeplink.TariffCardDatePickerLink;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import j31.InterfaceC42189a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCardDatePickerLinkResultConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/das_date_picker/deeplink/h;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/g;", "<init>", "()V", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.a
@InterfaceC42189a
/* loaded from: classes12.dex */
public final class h implements com.avito.android.lib.beduin_v2.feature.launchclient.g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f132264a = C42727D.c(a.f132265l);

    /* compiled from: TariffCardDatePickerLinkResultConverter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/text/SimpleDateFormat;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<SimpleDateFormat> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f132265l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("d MMMM", Locale.getDefault());
        }
    }

    @Inject
    public h() {
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @Y61.k
    public final com.avito.beduin.v2.interaction.launch.flow.j a(@Y61.k InterfaceC14249c.b bVar) {
        com.avito.beduin.v2.interaction.launch.flow.k[] kVarArr;
        if (bVar instanceof TariffCardDatePickerLink.b.a) {
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) g.f132262a.getValue();
            Date date = ((TariffCardDatePickerLink.b.a) bVar).f132248b;
            kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[]{new com.avito.beduin.v2.interaction.launch.flow.k("value", simpleDateFormat.format(date)), new com.avito.beduin.v2.interaction.launch.flow.k("name", ((SimpleDateFormat) this.f132264a.getValue()).format(date))};
        } else {
            kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[0];
        }
        return new com.avito.beduin.v2.interaction.launch.flow.j(kVarArr);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @Y61.k
    public final ResultStatus b(@Y61.k InterfaceC14249c.b bVar) {
        return bVar instanceof TariffCardDatePickerLink.b.a ? ResultStatus.f337439c : ResultStatus.f337441e;
    }
}

package com.avito.android.entry_point_client_room.report.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.entry_point_client_room.report.mvi.entity.SendReportInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import oz.InterfaceC44959a;
import sz.AbstractC48438c;

/* compiled from: SendReportActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/entry_point_client_room/report/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lsz/c;", "Lcom/avito/android/entry_point_client_room/report/mvi/entity/SendReportInternalAction;", "Lsz/e;", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.arch.mvi.a<AbstractC48438c, SendReportInternalAction, sz.e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f147701a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44959a f147702b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f147703c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f147704d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f147705e;

    @Inject
    public b(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC44959a interfaceC44959a, @com.avito.android.entry_point_client_room.report.di.c @Y61.l String str, @Y61.l @com.avito.android.entry_point_client_room.report.di.f String str2, @Y61.l @com.avito.android.entry_point_client_room.report.di.b Integer num) {
        this.f147701a = aVar;
        this.f147702b = interfaceC44959a;
        this.f147703c = str;
        this.f147704d = str2;
        this.f147705e = num;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SendReportInternalAction> b(AbstractC48438c abstractC48438c, sz.e eVar) {
        return C43175k.G(new a(abstractC48438c, eVar, this, null));
    }
}

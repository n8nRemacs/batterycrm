package com.avito.android.entry_point_client_room.report.mvi;

import android.net.Uri;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import dagger.internal.x;
import dagger.internal.y;
import java.io.Serializable;
import javax.inject.Provider;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import sz.C48436a;
import sz.C48437b;

/* compiled from: SendReportFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final c f147720a;

    /* renamed from: b, reason: collision with root package name */
    public final j f147721b;

    /* renamed from: c, reason: collision with root package name */
    public final h f147722c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f147723d;

    public f(c cVar, j jVar, h hVar, Provider provider) {
        this.f147720a = cVar;
        this.f147721b = jVar;
        this.f147722c = hVar;
        this.f147723d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f147720a.get();
        this.f147721b.getClass();
        i iVar = new i();
        this.f147722c.getClass();
        g gVar = new g();
        return new e("SendReportREFeature", new sz.e(com.avito.android.printable_text.b.c(R.string.send_report_title, new Serializable[0]), new AttributedText("Менеджер Авито поможет решить проблему или подберёт другого агента.", C42784z0.f406748b, 1), new C48437b("", com.avito.android.printable_text.b.c(R.string.send_report_phone_input_placeholder, new Serializable[0]), false, false, 1), new C48437b("", com.avito.android.printable_text.b.c(R.string.send_report_description_input_placeholder, new Serializable[0]), false, true, 5), new C48436a(com.avito.android.printable_text.b.c(R.string.send_report_action_title, new Serializable[0]), false), new AttributedText("{{text}} {{link}}.", C42745f0.U(new FontAttribute("text", "Обрабатываем ваши персональные данные согласно", C42745f0.U(new FontParameter.TextStyleParameter(null, "s20"), new FontParameter.ColorParameter(null, null, "gray48"))), new DeepLinkAttribute("link", "политике", new WebViewLink.OnlyAvitoDomain(Uri.parse("https://www.avito.ru/legal/rules/privacy-policy"), null, null, 6, null), null, null, C42745f0.U(new FontParameter.TextStyleParameter(null, "s20"), new FontParameter.ColorParameter(null, null, "gray48"), FontParameter.UnderlineParameter.INSTANCE), 24, null)), 1)), new d(bVar, this.f147723d.get(), iVar, gVar));
    }
}

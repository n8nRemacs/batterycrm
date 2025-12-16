package com.avito.android.publish.restriction;

import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DetailsSheetButton;
import com.avito.android.deep_linking.links.Theme;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.category_parameters.RestrictionConfig;
import com.avito.android.util.InterfaceC35745a5;
import dl0.InterfaceC39749a;
import fl0.C40438b;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.s;

/* compiled from: RestrictionInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/restriction/g;", "Lcom/avito/android/publish/restriction/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.restriction.b f239082a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39749a f239083b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f239084c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f239085d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Q1 f239086e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final x f239087f;

    /* compiled from: RestrictionInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<Theme> f239088a = kotlin.enums.c.a(Theme.values());
    }

    /* compiled from: RestrictionInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f239089a;

        static {
            int[] iArr = new int[RestrictionConfig.HttpMethod.values().length];
            try {
                iArr[RestrictionConfig.HttpMethod.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RestrictionConfig.HttpMethod.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RestrictionConfig.HttpMethod.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f239089a = iArr;
        }
    }

    @Inject
    public g(@Y61.k com.avito.android.publish.restriction.b bVar, @Y61.k InterfaceC39749a interfaceC39749a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k Q1 q12, @Y61.k x xVar) {
        this.f239082a = bVar;
        this.f239083b = interfaceC39749a;
        this.f239084c = interfaceC35745a5;
        this.f239085d = interfaceC28373a;
        this.f239086e = q12;
        this.f239087f = xVar;
    }

    @Override // com.avito.android.publish.restriction.e
    @Y61.k
    public final C42007e a(@Y61.k final RestrictionConfig.Request request, @Y61.l final String str) {
        return new C42007e(new s() { // from class: com.avito.android.publish.restriction.f
            /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
            @Override // l41.s
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() {
                /*
                    Method dump skipped, instructions count: 261
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.restriction.f.get():java.lang.Object");
            }
        });
    }

    public final DetailsSheetButton b(C40438b c40438b) {
        if (c40438b == null) {
            return null;
        }
        String title = c40438b.getTitle();
        String style = c40438b.getStyle();
        String url = c40438b.getUrl();
        return new DetailsSheetButton(title, style, null, url != null ? this.f239087f.b(url) : null, null, null, 52, null);
    }
}

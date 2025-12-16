package com.avito.android.cv_upload.screens.cv_picker;

import Y41.l;
import Y61.k;
import android.os.Bundle;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.util.C35961v3;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;

/* compiled from: CvPickerActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cv_upload/screens/cv_picker/CvPickerActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CvPickerActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final a f131687p = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f131688m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f131689n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final Object f131690o = C35961v3.a(this);

    /* compiled from: CvPickerActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_upload/screens/cv_picker/CvPickerActivity$a;", "", "<init>", "()V", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CvPickerActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends C42801a implements l<DeepLink, G0> {
        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            b.a.a((com.avito.android.deeplink_handler.handler.composite.a) this.receiver, deepLink, null, null, 6);
            return G0.f406611a;
        }
    }

    /* compiled from: CvPickerActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            ((CvPickerActivity) this.receiver).finish();
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.cv_upload.di.cv_picker.c.a().a(cv.c.a(this), (com.avito.android.cv_upload.di.cv_picker.b) C29972i.a(C29972i.b(this), com.avito.android.cv_upload.di.cv_picker.b.class)).a(this);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.cv_picker_activity);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.root);
        InterfaceC28373a interfaceC28373a = this.f131689n;
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
        CvPickerParams cvPickerParams = (CvPickerParams) this.f131690o.getValue();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f131688m;
        com.avito.android.cv_upload.screens.cv_picker.c cVar = new com.avito.android.cv_upload.screens.cv_picker.c(viewGroup, interfaceC28373a2, cvPickerParams, new b(1, aVar != null ? aVar : null, com.avito.android.deeplink_handler.handler.composite.a.class, "handle", "handle(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Landroid/os/Bundle;)V", 0), new c(0, this, CvPickerActivity.class, "finish", "finish()V", 0));
        I5.a(cVar.f131698e, cvPickerParams.f131691b.f134088d, false);
        interfaceC28373a2.c(new Ft.c(cVar.f131699f));
    }
}

package com.avito.android.travel_file_download_deeplink;

import Cd.C13243a;
import HE0.a;
import HE0.b;
import Y41.l;
import Y61.k;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C22777e;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.x;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.travel_file_download_deeplink.FileDownloadActivity;
import com.avito.android.travel_file_download_deeplink.di.b;
import com.avito.android.travel_file_download_deeplink.mvi.FileDownloadScreen;
import cv.InterfaceC39417a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: FileDownloadActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/FileDownloadActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FileDownloadActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: q, reason: collision with root package name */
    @k
    public static final a f301654q = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.travel_file_download_deeplink.i f301655m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f301657o;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f301656n = new O0(m0.f406844a.b(com.avito.android.travel_file_download_deeplink.h.class), new g(), new f(new i()), new h());

    /* renamed from: p, reason: collision with root package name */
    @k
    public final b f301658p = new b();

    /* compiled from: FileDownloadActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/FileDownloadActivity$a;", "", "<init>", "()V", "", "FILE_DOWNLOAD_OPEN_PARAMS_KEY", "Ljava/lang/String;", "FILE_DOWNLOAD_RESULT_KEY", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FileDownloadActivity.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/travel_file_download_deeplink/FileDownloadActivity$b", "Landroidx/activity/x;", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends x {
        public b() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            a aVar = FileDownloadActivity.f301654q;
            FileDownloadActivity.this.a2().accept(a.C0401a.f7014a);
        }
    }

    /* compiled from: FileDownloadActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<HE0.b, G0> {
        @Override // Y41.l
        public final G0 invoke(HE0.b bVar) {
            HE0.b bVar2 = bVar;
            FileDownloadActivity fileDownloadActivity = (FileDownloadActivity) this.receiver;
            a aVar = FileDownloadActivity.f301654q;
            fileDownloadActivity.getClass();
            if (bVar2 instanceof b.a) {
                fileDownloadActivity.setResult(-1, new Intent().putExtras(C22777e.b(new Q("file_download_result_key", ((b.a) bVar2).f7017a))));
                fileDownloadActivity.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FileDownloadActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHE0/c;", "it", "Lkotlin/G0;", "invoke", "(LHE0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<HE0.c, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f301660l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(HE0.c cVar) {
            return G0.f406611a;
        }
    }

    /* compiled from: FileDownloadActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHE0/a;", "it", "Lkotlin/G0;", "invoke", "(LHE0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements l<HE0.a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(HE0.a aVar) {
            a aVar2 = FileDownloadActivity.f301654q;
            FileDownloadActivity.this.a2().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f301662l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f301662l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f301662l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return FileDownloadActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return FileDownloadActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: FileDownloadActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/travel_file_download_deeplink/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.travel_file_download_deeplink.h> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.travel_file_download_deeplink.h invoke() {
            com.avito.android.travel_file_download_deeplink.i iVar = FileDownloadActivity.this.f301655m;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.travel_file_download_deeplink.h) iVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        FileDownloadOpenParams fileDownloadOpenParams;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(FileDownloadScreen.f301766d, s.a(this), null, 4, null);
        b.a aVarA = com.avito.android.travel_file_download_deeplink.di.a.a();
        InterfaceC39417a interfaceC39417aA = cv.c.a(this);
        com.avito.android.travel_file_download_deeplink.di.e eVar = (com.avito.android.travel_file_download_deeplink.di.e) C29972i.a(C29972i.b(this), com.avito.android.travel_file_download_deeplink.di.e.class);
        e eVar2 = new e();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            fileDownloadOpenParams = (FileDownloadOpenParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("file_download_open_params_key", FileDownloadOpenParams.class) : extras.getParcelable("file_download_open_params_key"));
        } else {
            fileDownloadOpenParams = null;
        }
        aVarA.a(interfaceC39417aA, eVar, c28478k, eVar2, fileDownloadOpenParams).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f301657o;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final com.avito.android.travel_file_download_deeplink.h a2() {
        return (com.avito.android.travel_file_download_deeplink.h) this.f301656n.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f301657o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.file_downloaod_activity, (ViewGroup) null, false);
        setContentView(viewInflate);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f301657o;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker2, a2(), new c(1, this, FileDownloadActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/travel_file_download_deeplink/mvi/entity/FileDownloadOneTimeEvent;)V", 0), d.f301660l);
        getF21241d().a(this, this.f301658p);
        View viewFindViewById = viewInflate.findViewById(R.id.cancel);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        final int i12 = 0;
        ((Button) viewFindViewById).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.travel_file_download_deeplink.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FileDownloadActivity f301689c;

            {
                this.f301689c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileDownloadActivity fileDownloadActivity = this.f301689c;
                switch (i12) {
                    case 0:
                        FileDownloadActivity.a aVar = FileDownloadActivity.f301654q;
                        fileDownloadActivity.a2().accept(a.b.f7015a);
                        break;
                    default:
                        FileDownloadActivity.a aVar2 = FileDownloadActivity.f301654q;
                        fileDownloadActivity.a2().accept(a.c.f7016a);
                        break;
                }
            }
        });
        final int i13 = 1;
        viewInflate.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.travel_file_download_deeplink.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FileDownloadActivity f301689c;

            {
                this.f301689c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileDownloadActivity fileDownloadActivity = this.f301689c;
                switch (i13) {
                    case 0:
                        FileDownloadActivity.a aVar = FileDownloadActivity.f301654q;
                        fileDownloadActivity.a2().accept(a.b.f7015a);
                        break;
                    default:
                        FileDownloadActivity.a aVar2 = FileDownloadActivity.f301654q;
                        fileDownloadActivity.a2().accept(a.c.f7016a);
                        break;
                }
            }
        });
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f301657o;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }
}

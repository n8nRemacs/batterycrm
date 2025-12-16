package com.huawei.updatesdk.service.otaupdate;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.text.style.TextAppearanceSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.huawei.updatesdk.b.i.a;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import com.huawei.updatesdk.service.otaupdate.c;
import java.io.Serializable;

/* loaded from: classes7.dex */
public class AppUpdateActivity extends Activity implements com.huawei.updatesdk.service.otaupdate.b, com.huawei.updatesdk.b.f.b {

    /* renamed from: a, reason: collision with root package name */
    private String f363885a;

    /* renamed from: b, reason: collision with root package name */
    private AlertDialog f363886b;

    /* renamed from: c, reason: collision with root package name */
    private com.huawei.updatesdk.b.i.a f363887c;

    /* renamed from: d, reason: collision with root package name */
    private com.huawei.updatesdk.b.i.a f363888d;

    /* renamed from: e, reason: collision with root package name */
    private ProgressBar f363889e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f363890f;

    /* renamed from: l, reason: collision with root package name */
    private com.huawei.updatesdk.b.d.c f363896l;

    /* renamed from: q, reason: collision with root package name */
    private s f363901q;

    /* renamed from: g, reason: collision with root package name */
    private boolean f363891g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f363892h = false;

    /* renamed from: i, reason: collision with root package name */
    private ApkUpgradeInfo f363893i = null;

    /* renamed from: j, reason: collision with root package name */
    private boolean f363894j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f363895k = false;

    /* renamed from: m, reason: collision with root package name */
    private int f363897m = -99;

    /* renamed from: n, reason: collision with root package name */
    private int f363898n = -99;

    /* renamed from: o, reason: collision with root package name */
    private int f363899o = -99;

    /* renamed from: p, reason: collision with root package name */
    private Intent f363900p = null;

    /* renamed from: r, reason: collision with root package name */
    private boolean f363902r = false;

    public class a implements com.huawei.updatesdk.b.i.b {
        public a() {
        }

        @Override // com.huawei.updatesdk.b.i.b
        public void a() {
            AppUpdateActivity.this.f363899o = UpdateStatusCode.DialogButton.CONFIRM;
            if (com.huawei.updatesdk.a.a.d.j.a.d(AppUpdateActivity.this)) {
                AppUpdateActivity.this.f();
                return;
            }
            AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
            Toast.makeText(appUpdateActivity, com.huawei.updatesdk.b.h.c.c(appUpdateActivity, "upsdk_no_available_network_prompt_toast"), 0).show();
            AppUpdateActivity.this.f363897m = 2;
            AppUpdateActivity.this.finish();
        }

        @Override // com.huawei.updatesdk.b.i.b
        public void b() {
            AppUpdateActivity.this.f363888d.a();
            AppUpdateActivity.this.f363897m = 4;
            AppUpdateActivity.this.f363899o = 100;
            if (AppUpdateActivity.this.f363894j) {
                AppUpdateActivity.this.finish();
                return;
            }
            com.huawei.updatesdk.service.otaupdate.c cVar = new com.huawei.updatesdk.service.otaupdate.c();
            AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
            cVar.a(appUpdateActivity, appUpdateActivity.f363885a, AppUpdateActivity.this.new p(), AppUpdateActivity.this.f363902r);
        }
    }

    public class b implements a.c {
        public b() {
        }

        @Override // com.huawei.updatesdk.b.i.a.c
        public void a() {
            AppUpdateActivity.this.finish();
        }
    }

    public class c implements DialogInterface.OnKeyListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i12, KeyEvent keyEvent) {
            if (i12 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            AppUpdateActivity.this.f363897m = 4;
            AppUpdateActivity.this.finish();
            return true;
        }
    }

    public class d implements com.huawei.updatesdk.b.i.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.updatesdk.service.appmgr.bean.c f363906a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.huawei.updatesdk.b.i.a f363907b;

        public d(com.huawei.updatesdk.service.appmgr.bean.c cVar, com.huawei.updatesdk.b.i.a aVar) {
            this.f363906a = cVar;
            this.f363907b = aVar;
        }

        @Override // com.huawei.updatesdk.b.i.b
        public void a() {
            AppUpdateActivity.this.d(this.f363906a);
            this.f363907b.a();
        }

        @Override // com.huawei.updatesdk.b.i.b
        public void b() {
            this.f363907b.a();
            if (AppUpdateActivity.this.f363894j) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                appUpdateActivity.c(appUpdateActivity.f363893i);
            } else {
                AppUpdateActivity.this.f363897m = 4;
                AppUpdateActivity.this.finish();
            }
        }
    }

    public class e implements a.c {
        public e() {
        }

        @Override // com.huawei.updatesdk.b.i.a.c
        public void a() {
            AppUpdateActivity.this.finish();
        }
    }

    public class f implements DialogInterface.OnKeyListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.updatesdk.b.i.a f363910a;

        public f(com.huawei.updatesdk.b.i.a aVar) {
            this.f363910a = aVar;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i12, KeyEvent keyEvent) {
            if (i12 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            if (!AppUpdateActivity.this.f363894j) {
                AppUpdateActivity.this.f363897m = 4;
                AppUpdateActivity.this.finish();
                return true;
            }
            this.f363910a.a();
            AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
            appUpdateActivity.c(appUpdateActivity.f363893i);
            return true;
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppUpdateActivity.this.b();
        }
    }

    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f363913a;

        public h(boolean z12) {
            this.f363913a = z12;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f363913a) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                appUpdateActivity.b(appUpdateActivity.f363893i);
            } else {
                AppUpdateActivity appUpdateActivity2 = AppUpdateActivity.this;
                appUpdateActivity2.c(appUpdateActivity2.f363893i);
            }
        }
    }

    public class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.updatesdk.a.b.b.b f363915a;

        public i(com.huawei.updatesdk.a.b.b.b bVar) {
            this.f363915a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bundle bundleB = this.f363915a.b();
            if (bundleB == null) {
                return;
            }
            int i12 = bundleB.getInt("INSTALL_STATE");
            com.huawei.updatesdk.service.otaupdate.d.a().a(AppUpdateActivity.this.a(i12, bundleB.getInt("INSTALL_TYPE"), -1));
            AppUpdateActivity.this.c(i12);
        }
    }

    public class j implements com.huawei.updatesdk.b.i.b {
        public j() {
        }

        @Override // com.huawei.updatesdk.b.i.b
        public void a() {
            AppUpdateActivity.this.f363889e.setProgress(0);
            AppUpdateActivity.this.f363889e.setMax(0);
            AppUpdateActivity.this.f363890f.setText("");
            AppUpdateActivity.this.a();
            if (AppUpdateActivity.this.f363896l != null) {
                AppUpdateActivity.this.f363896l.a();
            }
            AppUpdateActivity.this.f363887c.a();
            if (AppUpdateActivity.this.f363894j) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                appUpdateActivity.c(appUpdateActivity.f363893i);
            } else {
                AppUpdateActivity.this.f363897m = 4;
                AppUpdateActivity.this.finish();
            }
        }

        @Override // com.huawei.updatesdk.b.i.b
        public void b() {
            AppUpdateActivity.this.f363887c.a();
        }
    }

    public class k implements a.c {
        public k() {
        }

        @Override // com.huawei.updatesdk.b.i.a.c
        public void a() {
            AppUpdateActivity.this.finish();
        }
    }

    public class l implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f363919a;

        public l(String str) {
            this.f363919a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AppUpdateActivity.this.b(this.f363919a);
        }
    }

    public class m implements com.huawei.updatesdk.b.i.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.updatesdk.service.appmgr.bean.c f363921a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.huawei.updatesdk.b.i.a f363922b;

        public m(com.huawei.updatesdk.service.appmgr.bean.c cVar, com.huawei.updatesdk.b.i.a aVar) {
            this.f363921a = cVar;
            this.f363922b = aVar;
        }

        @Override // com.huawei.updatesdk.b.i.b
        public void a() {
            if (!com.huawei.updatesdk.a.a.d.j.a.d(AppUpdateActivity.this)) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                Toast.makeText(appUpdateActivity, com.huawei.updatesdk.b.h.c.c(appUpdateActivity, "upsdk_no_available_network_prompt_toast"), 0).show();
                AppUpdateActivity.this.finish();
            } else if (com.huawei.updatesdk.a.a.d.j.a.c(AppUpdateActivity.this) != 1) {
                AppUpdateActivity.this.c(this.f363921a);
            } else {
                AppUpdateActivity.this.d(this.f363921a);
                this.f363922b.a();
            }
        }

        @Override // com.huawei.updatesdk.b.i.b
        public void b() {
            this.f363922b.a();
            if (AppUpdateActivity.this.f363894j) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                appUpdateActivity.c(appUpdateActivity.f363893i);
            } else {
                AppUpdateActivity.this.f363897m = 4;
                AppUpdateActivity.this.finish();
            }
        }
    }

    public class n implements a.c {
        public n() {
        }

        @Override // com.huawei.updatesdk.b.i.a.c
        public void a() {
            AppUpdateActivity.this.finish();
        }
    }

    public class o implements DialogInterface.OnKeyListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.updatesdk.b.i.a f363925a;

        public o(com.huawei.updatesdk.b.i.a aVar) {
            this.f363925a = aVar;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i12, KeyEvent keyEvent) {
            if (i12 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            if (!AppUpdateActivity.this.f363894j) {
                AppUpdateActivity.this.f363897m = 4;
                AppUpdateActivity.this.finish();
                return true;
            }
            this.f363925a.a();
            AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
            appUpdateActivity.c(appUpdateActivity.f363893i);
            return true;
        }
    }

    public class p implements c.a {
        public p() {
        }

        @Override // com.huawei.updatesdk.service.otaupdate.c.a
        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                try {
                    Intent intent = new Intent("com.huawei.appmarket.intent.action.ThirdUpdateRemindAction");
                    intent.setPackage(AppUpdateActivity.this.f363885a);
                    AppUpdateActivity.this.startActivity(intent);
                } catch (ActivityNotFoundException e12) {
                    com.huawei.updatesdk.a.a.c.a.a.a.b("AppUpdateActivity", "goHiappUpgrade error: " + e12.toString());
                }
            }
            AppUpdateActivity.this.finish();
        }
    }

    public static class q implements DialogInterface.OnDismissListener {
        private q() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            Intent intent = new Intent();
            intent.putExtra(UpdateKey.DIALOG_STATUS, UpdateDialogStatusCode.DISMISS);
            com.huawei.updatesdk.service.otaupdate.d.a().b(intent);
        }

        public /* synthetic */ q(g gVar) {
            this();
        }
    }

    public static class r implements DialogInterface.OnShowListener {
        private r() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Intent intent = new Intent();
            intent.putExtra(UpdateKey.DIALOG_STATUS, UpdateDialogStatusCode.SHOW);
            com.huawei.updatesdk.service.otaupdate.d.a().b(intent);
        }

        public /* synthetic */ r(g gVar) {
            this();
        }
    }

    public class s extends com.huawei.updatesdk.a.b.b.a {
        private s() {
        }

        @Override // com.huawei.updatesdk.a.b.b.a
        public void a(Context context, com.huawei.updatesdk.a.b.b.b bVar) {
            if (bVar.d()) {
                if (AppUpdateActivity.this.f363887c != null) {
                    AppUpdateActivity.this.f363887c.a();
                }
                AppUpdateActivity.this.a();
                String strA = bVar.a();
                String dataString = bVar.c().getDataString();
                if (dataString == null || dataString.length() < 9) {
                    return;
                }
                String strSubstring = dataString.substring(8);
                if ("android.intent.action.PACKAGE_ADDED".equals(strA) && TextUtils.equals(AppUpdateActivity.this.f363885a, strSubstring)) {
                    com.huawei.updatesdk.service.otaupdate.d.a().a(AppUpdateActivity.this.a(6, 0, -1));
                    com.huawei.updatesdk.b.h.b.a();
                    AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                    appUpdateActivity.a(appUpdateActivity.f363893i.getPackage_(), AppUpdateActivity.this.f363893i.getDetailId_());
                    if (AppUpdateActivity.this.f363894j) {
                        AppUpdateActivity appUpdateActivity2 = AppUpdateActivity.this;
                        appUpdateActivity2.c(appUpdateActivity2.f363893i);
                    }
                }
            }
        }

        public /* synthetic */ s(AppUpdateActivity appUpdateActivity, g gVar) {
            this();
        }
    }

    private void d() {
        com.huawei.updatesdk.b.i.a aVar = this.f363888d;
        if (aVar != null) {
            g gVar = null;
            aVar.a(new q(gVar));
            this.f363888d.a(new r(gVar));
        }
    }

    private void e() {
        com.huawei.updatesdk.service.otaupdate.a.a(this, this.f363901q);
        com.huawei.updatesdk.b.f.c.a().b(this);
        com.huawei.updatesdk.b.d.c cVar = this.f363896l;
        if (cVar != null) {
            cVar.b();
        }
        com.huawei.updatesdk.b.d.f.a((com.huawei.updatesdk.service.otaupdate.b) null);
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.f363891g) {
            overridePendingTransition(0, 0);
        }
        Intent intent = new Intent();
        this.f363900p = intent;
        intent.putExtra("status", this.f363897m);
        this.f363900p.putExtra(UpdateKey.FAIL_CODE, this.f363898n);
        this.f363900p.putExtra(UpdateKey.MUST_UPDATE, this.f363891g);
        this.f363900p.putExtra(UpdateKey.BUTTON_STATUS, this.f363899o);
        com.huawei.updatesdk.service.otaupdate.d.a().b(this.f363900p);
        super.finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i12, int i13, Intent intent) {
        if (i12 == 1002) {
            if (intent != null) {
                com.huawei.updatesdk.a.b.b.b bVarA = com.huawei.updatesdk.a.b.b.b.a(intent);
                this.f363897m = i13;
                this.f363898n = bVarA.a("installResultCode", -99);
                this.f363891g = bVarA.a(UpdateKey.MUST_UPDATE, false);
            }
            this.f363899o = i13 == 4 ? 100 : UpdateStatusCode.DialogButton.CONFIRM;
            if (this.f363892h) {
                return;
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Serializable serializable;
        requestWindowFeature(1);
        com.huawei.updatesdk.a.a.d.i.c.e().a(getWindow());
        super.onCreate(bundle);
        Bundle bundleB = com.huawei.updatesdk.a.b.b.b.a(getIntent()).b();
        com.huawei.updatesdk.a.b.a.a.a(this);
        if (bundleB != null) {
            try {
                serializable = bundleB.getSerializable("app_update_parm");
                this.f363902r = bundleB.getBoolean("is_apptouch", false);
            } catch (Exception e12) {
                com.huawei.updatesdk.a.a.a.a("AppUpdateActivity", "Type Conversion Error: " + e12.toString());
                super.finish();
                return;
            }
        } else {
            serializable = null;
        }
        String strB = com.huawei.updatesdk.b.e.f.a(this.f363902r).b();
        this.f363885a = strB;
        if (TextUtils.isEmpty(strB)) {
            com.huawei.updatesdk.a.a.a.a("AppUpdateActivity", "finish activity and appStorePkgName is: " + this.f363885a);
            super.finish();
            return;
        }
        if (!(serializable instanceof ApkUpgradeInfo)) {
            this.f363897m = 3;
            finish();
            return;
        }
        this.f363893i = (ApkUpgradeInfo) serializable;
        this.f363895k = bundleB.getBoolean("app_must_btn", false);
        if (this.f363893i.getIsCompulsoryUpdate_() == 1) {
            this.f363894j = true;
        }
        if (1 == this.f363893i.getDevType_() && com.huawei.updatesdk.b.h.b.f(this, this.f363885a)) {
            b(this.f363893i);
        } else if (2 == this.f363893i.getDevType_() && com.huawei.updatesdk.b.h.b.e(this, this.f363885a)) {
            com.huawei.updatesdk.b.g.c.f363855b.execute(new g());
        } else {
            c(this.f363893i);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        com.huawei.updatesdk.b.i.a aVar = this.f363887c;
        if (aVar != null) {
            aVar.a();
            this.f363887c = null;
        }
        com.huawei.updatesdk.b.i.a aVar2 = this.f363888d;
        if (aVar2 != null) {
            aVar2.a();
            this.f363888d = null;
        }
        a();
        e();
        super.onDestroy();
        finishActivity(1002);
    }

    private long a(ApkUpgradeInfo apkUpgradeInfo) {
        long longSize_ = apkUpgradeInfo.getLongSize_();
        if (apkUpgradeInfo.getPackingType_() == 1 && apkUpgradeInfo.getBundleSize_() > 0) {
            return apkUpgradeInfo.getBundleSize_();
        }
        if (apkUpgradeInfo.getPackingType_() == 3 && apkUpgradeInfo.getObbSize_() > 0) {
            longSize_ += apkUpgradeInfo.getObbSize_();
        }
        if (apkUpgradeInfo.getDiffSize_() <= 0) {
            return longSize_;
        }
        long diffSize_ = apkUpgradeInfo.getDiffSize_();
        return (apkUpgradeInfo.getPackingType_() != 3 || apkUpgradeInfo.getObbSize_() <= 0) ? diffSize_ : diffSize_ + apkUpgradeInfo.getObbSize_();
    }

    private void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        s sVar = new s(this, null);
        this.f363901q = sVar;
        com.huawei.updatesdk.service.otaupdate.a.a(this, intentFilter, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(com.huawei.updatesdk.service.appmgr.bean.c cVar) {
        c();
        b(cVar.d(), cVar.a());
        com.huawei.updatesdk.b.d.b bVar = new com.huawei.updatesdk.b.d.b(cVar.b(), cVar.c(), cVar.e());
        bVar.a(cVar.d());
        com.huawei.updatesdk.b.d.c cVar2 = new com.huawei.updatesdk.b.d.c(bVar);
        this.f363896l = cVar2;
        cVar2.executeOnExecutor(com.huawei.updatesdk.b.g.c.f363854a, new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (com.huawei.updatesdk.b.h.b.d(this, this.f363885a)) {
            a(this.f363893i.getPackage_(), this.f363893i.getDetailId_());
            return;
        }
        com.huawei.updatesdk.b.d.f.a(this);
        com.huawei.updatesdk.b.d.f.a(this.f363902r);
        this.f363888d.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Intent a(int i12, int i13, int i14) {
        Intent intent = new Intent();
        intent.putExtra(UpdateKey.MARKET_DLD_STATUS, i14);
        intent.putExtra(UpdateKey.MARKET_INSTALL_STATE, i12);
        intent.putExtra(UpdateKey.MARKET_INSTALL_TYPE, i13);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        runOnUiThread(new h(com.huawei.updatesdk.b.h.b.a(this.f363885a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i12) {
        if (i12 == 5 || i12 == 4) {
            Toast.makeText(this, getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_third_app_dl_install_failed")), 0).show();
            com.huawei.updatesdk.b.h.b.a();
            finish();
        }
        if (i12 == 7) {
            com.huawei.updatesdk.b.h.b.a();
            if (this.f363891g) {
                c(this.f363893i);
            } else {
                finish();
            }
        }
    }

    private void c(com.huawei.updatesdk.a.b.b.b bVar) {
        new Handler(Looper.getMainLooper()).post(new i(bVar));
    }

    @Override // com.huawei.updatesdk.service.otaupdate.b
    public void b(int i12) {
        Toast.makeText(this, getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_getting_message_fail_prompt_toast")), 0).show();
        com.huawei.updatesdk.service.otaupdate.d.a().a(i12);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            AlertDialog alertDialog = this.f363886b;
            if (alertDialog == null || !alertDialog.isShowing()) {
                return;
            }
            this.f363886b.dismiss();
            this.f363886b = null;
        } catch (IllegalArgumentException unused) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("AppUpdateActivity", "progressDialog dismiss IllegalArgumentException");
        }
    }

    private void b(com.huawei.updatesdk.a.b.b.b bVar) {
        if (this.f363889e == null) {
            return;
        }
        this.f363889e.setProgress(com.huawei.updatesdk.b.h.d.a(bVar.b("download_apk_already", 0), bVar.b("download_apk_size", 0)));
        this.f363890f.setText(com.huawei.updatesdk.b.h.d.a((int) ((this.f363889e.getProgress() / this.f363889e.getMax()) * 100.0f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(ApkUpgradeInfo apkUpgradeInfo) {
        com.huawei.updatesdk.a.a.a.b("AppUpdateActivity", "showOtaDialog");
        if (apkUpgradeInfo == null) {
            finish();
            return;
        }
        String string = getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_ota_title"));
        String string2 = getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_ota_notify_updatebtn"));
        String string3 = getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_ota_cancel"));
        if (!a(string)) {
            com.huawei.updatesdk.a.a.a.a("AppUpdateActivity", "UpdateSDK show update dialog error and resource is proguard, please add ignore proguard rules!");
            finish();
            return;
        }
        if (1 == apkUpgradeInfo.getIsCompulsoryUpdate_()) {
            string3 = getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_ota_force_cancel_new"));
            if (this.f363895k) {
                this.f363888d.c();
            }
            this.f363891g = true;
        }
        this.f363888d.a(new a());
        d();
        this.f363888d.a(new b());
        if (this.f363891g) {
            this.f363888d.a(false);
        } else {
            this.f363888d.a(new c());
        }
        this.f363888d.a(-1, string2);
        this.f363888d.a(-2, string3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ApkUpgradeInfo apkUpgradeInfo) {
        Intent intent = new Intent("com.huawei.appmarket.intent.action.ThirdUpdateAction");
        intent.setPackage(this.f363885a);
        intent.putExtra("APP_PACKAGENAME", apkUpgradeInfo.getPackage_());
        intent.putExtra("devType", apkUpgradeInfo.getDevType_());
        intent.putExtra("version", apkUpgradeInfo.getVersion_());
        intent.putExtra("longSize", apkUpgradeInfo.getLongSize_());
        intent.putExtra("newFeature", apkUpgradeInfo.getNewFeatures_());
        intent.putExtra("IsCompulsoryUpdate", apkUpgradeInfo.getIsCompulsoryUpdate_());
        intent.putExtra("APP_MUST_UPDATE_BTN", this.f363895k);
        intent.putExtra("VersionCode", apkUpgradeInfo.getVersionCode_());
        intent.putExtra("detailId", apkUpgradeInfo.getDetailId_());
        intent.putExtra("name", apkUpgradeInfo.getName_());
        try {
            this.f363892h = false;
            startActivityForResult(intent, 1002);
        } catch (ActivityNotFoundException e12) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("AppUpdateActivity", "goHiappUpgrade error: " + e12.toString());
            this.f363892h = true;
            Intent intent2 = new Intent();
            intent2.putExtra("status", 8);
            com.huawei.updatesdk.service.otaupdate.d.a().b(intent2);
            c(apkUpgradeInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.huawei.updatesdk.service.appmgr.bean.c cVar) {
        com.huawei.updatesdk.b.i.a aVarA = com.huawei.updatesdk.b.i.a.a(this, null, getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_mobile_dld_warn"), com.huawei.updatesdk.b.h.d.a(this, cVar.c())));
        aVarA.a(new d(cVar, aVarA));
        String string = getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_app_download_info_new"));
        aVarA.a(new e());
        aVarA.a(-1, string);
        aVarA.a(new f(aVarA));
    }

    @Override // com.huawei.updatesdk.service.otaupdate.b
    public void a(int i12) {
        Toast.makeText(this, getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_getting_message_fail_prompt_toast")), 0).show();
        com.huawei.updatesdk.service.otaupdate.d.a().a(i12);
        finish();
    }

    private void b(com.huawei.updatesdk.service.appmgr.bean.c cVar) {
        com.huawei.updatesdk.b.i.a aVarA = com.huawei.updatesdk.b.i.a.a(this, null, getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_appstore_install"), cVar.a()));
        aVarA.a(new m(cVar, aVarA));
        String string = getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_app_download_info_new"));
        aVarA.a(new n());
        aVarA.a(-1, string);
        aVarA.a(new o(aVarA));
    }

    @Override // com.huawei.updatesdk.b.f.b
    public void a(int i12, com.huawei.updatesdk.a.b.b.b bVar) {
        if (bVar == null) {
            return;
        }
        if (i12 == 0) {
            a(bVar);
        } else if (1 == i12) {
            b(bVar);
        } else {
            c(bVar);
        }
    }

    private void a(View view) {
        if (com.huawei.updatesdk.a.a.d.i.c.k()) {
            try {
                ScrollView scrollView = (ScrollView) view.findViewById(com.huawei.updatesdk.b.h.c.a(this, "scroll_layout"));
                TypedValue typedValue = new TypedValue();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getTheme().resolveAttribute(R.attr.dialogPreferredPadding, typedValue, true);
                ((WindowManager) getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                int iComplexToDimensionPixelSize = TypedValue.complexToDimensionPixelSize(typedValue.data, displayMetrics);
                scrollView.setPadding(iComplexToDimensionPixelSize, 0, iComplexToDimensionPixelSize, 0);
            } catch (Exception e12) {
                com.huawei.updatesdk.a.a.c.a.a.a.b("AppUpdateActivity", e12.toString());
            }
        }
    }

    private void a(com.huawei.updatesdk.a.b.b.b bVar) {
        Bundle bundleB = bVar.b();
        if (bundleB != null) {
            int i12 = bundleB.getInt("download_status_param", -1);
            com.huawei.updatesdk.service.otaupdate.d.a().a(a(-1, -1, i12));
            if (com.huawei.updatesdk.b.d.a.a(i12)) {
                return;
            }
            a();
            if (com.huawei.updatesdk.b.d.a.b(i12)) {
                Toast.makeText(this, getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_third_app_dl_install_failed")), 0).show();
                finish();
            }
        }
    }

    private void a(ApkUpgradeInfo apkUpgradeInfo, TextView textView) {
        if (textView == null) {
            return;
        }
        if (apkUpgradeInfo.getDiffSize_() <= 0) {
            textView.setVisibility(8);
            return;
        }
        String strA = com.huawei.updatesdk.b.h.d.a(this, (apkUpgradeInfo.getPackingType_() != 3 || apkUpgradeInfo.getObbSize_() <= 0) ? apkUpgradeInfo.getLongSize_() : apkUpgradeInfo.getObbSize_() + apkUpgradeInfo.getLongSize_());
        SpannableString spannableString = new SpannableString(strA);
        spannableString.setSpan(new StrikethroughSpan(), 0, strA.length(), 33);
        spannableString.setSpan(new TextAppearanceSpan(com.huawei.updatesdk.b.h.a.f().b() > 0 ? "HnChinese-medium" : "HwChinese-medium", 0, (int) textView.getTextSize(), null, null), 0, spannableString.length(), 33);
        textView.setText(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        com.huawei.updatesdk.b.i.a aVarA = com.huawei.updatesdk.b.i.a.a(this, null, getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_third_app_dl_cancel_download_prompt_ex")));
        this.f363887c = aVarA;
        aVarA.a(new j());
        String string = getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_third_app_dl_sure_cancel_download"));
        this.f363887c.a(new k());
        this.f363887c.a(-1, string);
    }

    private void b(String str, String str2) {
        AlertDialog alertDialog = this.f363886b;
        if (alertDialog == null || !alertDialog.isShowing()) {
            this.f363886b = (com.huawei.updatesdk.a.a.d.i.c.k() ? new AlertDialog.Builder(this) : ((getResources().getConfiguration().uiMode & 48) != 32 || Build.VERSION.SDK_INT < 29) ? new AlertDialog.Builder(this, R.style.Theme.DeviceDefault.Light.Dialog.Alert) : new AlertDialog.Builder(this, R.style.Theme.DeviceDefault.Dialog.Alert)).create();
            com.huawei.updatesdk.a.a.d.i.c.e().a(this.f363886b.getWindow());
            View viewInflate = LayoutInflater.from(this).inflate(com.huawei.updatesdk.b.h.c.b(this, "upsdk_app_dl_progress_dialog"), (ViewGroup) null);
            ((TextView) viewInflate.findViewById(com.huawei.updatesdk.b.h.c.a(this, "third_app_warn_text"))).setText(getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_app_download_installing"), str2));
            ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(com.huawei.updatesdk.b.h.c.a(this, "third_app_dl_progressbar"));
            this.f363889e = progressBar;
            progressBar.setMax(100);
            this.f363890f = (TextView) viewInflate.findViewById(com.huawei.updatesdk.b.h.c.a(this, "third_app_dl_progress_text"));
            viewInflate.findViewById(com.huawei.updatesdk.b.h.c.a(this, "cancel_bg")).setOnClickListener(new l(str));
            this.f363886b.setView(viewInflate);
            this.f363886b.setCancelable(false);
            this.f363886b.setCanceledOnTouchOutside(false);
            if (!com.huawei.updatesdk.service.otaupdate.a.a(this)) {
                this.f363886b.show();
            }
            this.f363890f.setText(com.huawei.updatesdk.b.h.d.a(0));
        }
    }

    @Override // com.huawei.updatesdk.service.otaupdate.b
    public void a(com.huawei.updatesdk.service.appmgr.bean.c cVar) {
        if (cVar == null || !cVar.f()) {
            Toast.makeText(this, getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_getting_message_fail_prompt_toast")), 0).show();
            finish();
        } else {
            com.huawei.updatesdk.b.f.c.a().a(this);
            this.f363885a = cVar.d();
            b(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            this.f363897m = 1;
            finish();
            return;
        }
        Intent intent = new Intent("com.huawei.appmarket.appmarket.intent.action.AppDetail.withdetailId");
        intent.setPackage(this.f363885a);
        intent.putExtra("appDetailId", str2);
        intent.putExtra("thirdId", str);
        intent.addFlags(268468224);
        try {
            startActivity(intent);
            if (this.f363894j) {
                return;
            }
            finish();
        } catch (Exception e12) {
            com.huawei.updatesdk.a.a.a.a("AppUpdateActivity", "openMarketUpdateDetail error: " + e12.toString());
            com.huawei.updatesdk.b.d.f.a(this);
            com.huawei.updatesdk.b.d.f.a(this.f363902r);
            Intent intent2 = new Intent();
            intent2.putExtra("status", 8);
            com.huawei.updatesdk.service.otaupdate.d.a().b(intent2);
            com.huawei.updatesdk.b.i.a aVar = this.f363888d;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    private boolean a(String str) {
        TextView textView;
        View viewInflate = LayoutInflater.from(this).inflate(com.huawei.updatesdk.b.h.c.b(this, "upsdk_ota_update_view"), (ViewGroup) null);
        String string = TextUtils.isEmpty(this.f363893i.getNewFeatures_()) ? getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_choice_update")) : this.f363893i.getNewFeatures_();
        if (viewInflate == null || (textView = (TextView) viewInflate.findViewById(com.huawei.updatesdk.b.h.c.a(this, "content_textview"))) == null) {
            return false;
        }
        textView.setText(string);
        String version_ = this.f363893i.getVersion_();
        TextView textView2 = (TextView) viewInflate.findViewById(com.huawei.updatesdk.b.h.c.a(this, "version_textview"));
        if (textView2 == null) {
            return false;
        }
        textView2.setText(version_);
        com.huawei.updatesdk.b.h.d.a(textView2);
        String strA = com.huawei.updatesdk.b.h.d.a(this, a(this.f363893i));
        TextView textView3 = (TextView) viewInflate.findViewById(com.huawei.updatesdk.b.h.c.a(this, "appsize_textview"));
        textView3.setText(strA);
        com.huawei.updatesdk.b.h.d.a(textView3);
        TextView textView4 = (TextView) viewInflate.findViewById(com.huawei.updatesdk.b.h.c.a(this, "name_textview"));
        textView4.setText(this.f363893i.getName_());
        com.huawei.updatesdk.b.h.d.a(textView4);
        TextView textView5 = (TextView) viewInflate.findViewById(com.huawei.updatesdk.b.h.c.a(this, "allsize_textview"));
        a(this.f363893i, textView5);
        com.huawei.updatesdk.b.h.d.a(textView5);
        a(viewInflate);
        com.huawei.updatesdk.b.i.a aVarA = com.huawei.updatesdk.b.i.a.a(this, str, null);
        this.f363888d = aVarA;
        aVarA.a(viewInflate);
        return true;
    }
}

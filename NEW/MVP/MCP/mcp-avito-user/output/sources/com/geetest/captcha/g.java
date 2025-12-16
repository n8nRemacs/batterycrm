package com.geetest.captcha;

import android.content.Context;
import android.text.TextUtils;
import com.geetest.captcha.GTCaptcha4Client;
import com.geetest.captcha.views.GTC4WebView;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public h f342722a;

    /* renamed from: b, reason: collision with root package name */
    public GTC4WebView f342723b;

    /* renamed from: c, reason: collision with root package name */
    public l0 f342724c;

    /* renamed from: d, reason: collision with root package name */
    public GTCaptcha4Client.OnDialogShowListener f342725d;

    public g(@Y61.l GTCaptcha4Client.OnDialogShowListener onDialogShowListener) {
        this.f342725d = onDialogShowListener;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:6|(4:11|(6:14|(4:149|16|(1:20)|21)(2:22|(1:(1:152)(7:148|27|(4:30|(2:32|157)(1:158)|33|28)|156|34|154|153))(2:150|35))|36|155|153|12)|147|37)|(4:39|(2:42|40)|159|43)|44|(1:50)(1:49)|51|(4:56|(1:58)|160|59)|60|(4:65|(1:67)|161|68)|69|135|70|71|137|72|73|74|75|(11:141|76|77|78|79|80|81|82|(3:86|(2:89|87)|162)|93|94)|139|101|(3:110|(1:112)(1:113)|114)|117|(1:119)|120|(1:122)|(3:143|123|124)|(3:145|125|164)) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02c8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02e7, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ca A[Catch: Exception -> 0x02c8, TryCatch #2 {Exception -> 0x02c8, blocks: (B:101:0x02a5, B:103:0x02ab, B:105:0x02b3, B:110:0x02ca, B:112:0x02da, B:114:0x02df, B:113:0x02dd), top: B:139:0x02a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02da A[Catch: Exception -> 0x02c8, TryCatch #2 {Exception -> 0x02c8, blocks: (B:101:0x02a5, B:103:0x02ab, B:105:0x02b3, B:110:0x02ca, B:112:0x02da, B:114:0x02df, B:113:0x02dd), top: B:139:0x02a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02dd A[Catch: Exception -> 0x02c8, TryCatch #2 {Exception -> 0x02c8, blocks: (B:101:0x02a5, B:103:0x02ab, B:105:0x02b3, B:110:0x02ca, B:112:0x02da, B:114:0x02df, B:113:0x02dd), top: B:139:0x02a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x033a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k android.content.Context r25, @Y61.k com.geetest.captcha.v r26, @Y61.k com.geetest.captcha.z r27) throws org.json.JSONException, android.content.pm.PackageManager.NameNotFoundException, java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instructions count: 951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.geetest.captcha.g.a(android.content.Context, com.geetest.captcha.v, com.geetest.captcha.z):void");
    }

    public final void b(Context context, v vVar, z zVar) {
        h hVar;
        if (TextUtils.isEmpty(vVar.f342794k)) {
            hVar = new h(context);
        } else {
            String str = vVar.f342794k;
            hVar = str != null ? new h(context, str) : null;
        }
        this.f342722a = hVar;
        if (hVar != null) {
            hVar.f342728b = this.f342725d;
        }
        if (hVar != null) {
            hVar.f342727a = this.f342723b;
        }
        if (hVar != null) {
            hVar.setOnKeyListener(new e(zVar));
        }
        h hVar2 = this.f342722a;
        if (hVar2 != null) {
            hVar2.show();
        }
    }
}

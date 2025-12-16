package com.avito.android.social;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.CookieManager;
import com.avito.android.social.D;
import com.vk.api.sdk.C37878d;
import com.vk.api.sdk.auth.VKScope;
import com.vk.api.sdk.ui.VKWebViewAuthActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import shark.AndroidResourceIdNames;

/* compiled from: VkontakteSocialManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/social/Y;", "Lcom/avito/android/social/X;", "<init>", "()V", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Y implements X {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public G11.a f284299a;

    /* compiled from: VkontakteSocialManager.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/social/Y$a", "LG11/b;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements G11.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y41.l<D.b, G0> f284300a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y f284301b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super D.b, G0> lVar, Y y12) {
            this.f284300a = lVar;
            this.f284301b = y12;
        }
    }

    @Inject
    public Y() {
    }

    @Override // com.avito.android.social.D
    public final void a() {
        G11.c cVar = C37878d.f366578d;
        cVar.getClass();
        cVar.a();
        com.vk.api.sdk.utils.n nVar = com.vk.api.sdk.utils.n.f366742a;
        C37878d.f366576b.getClass();
        nVar.getClass();
        CookieManager.getInstance().removeAllCookies(null);
    }

    @Override // com.avito.android.social.D
    @Y61.l
    /* renamed from: c */
    public final String getF284415b() {
        G11.a aVar = this.f284299a;
        if (aVar == null || !aVar.a()) {
            return null;
        }
        return this.f284299a.f6198b;
    }

    @Override // com.avito.android.social.D
    @Y61.l
    public final String d() {
        G11.a aVar = this.f284299a;
        if (aVar != null) {
            return aVar.f6201e;
        }
        return null;
    }

    @Override // com.avito.android.social.D
    public final void e(@Y61.k SocialActivity socialActivity, @Y61.l Y41.l lVar) throws Resources.NotFoundException {
        int iA2;
        a();
        List listU = C42745f0.U(VKScope.f366530d, VKScope.f366528b);
        C37878d.f366578d.getClass();
        C37878d c37878d = C37878d.f366575a;
        try {
            c37878d.getClass();
            com.vk.api.sdk.p pVar = C37878d.f366577c;
            pVar.getClass();
            iA2 = pVar.f366676a.f366592b;
        } catch (Exception unused) {
            c37878d.getClass();
            iA2 = C37878d.a(socialActivity);
        }
        int i12 = iA2;
        VKScope vKScope = VKScope.f366529c;
        if (!listU.contains(vKScope)) {
            listU = C42745f0.i0(vKScope, listU);
        }
        G11.d dVar = new G11.d(i12, null, listU, 2, null);
        com.vk.api.sdk.utils.n nVar = com.vk.api.sdk.utils.n.f366742a;
        PackageManager packageManager = socialActivity.getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = packageManager == null ? null : packageManager.queryIntentActivities(new Intent("com.vkontakte.android.action.SDK_AUTH", (Uri) null), AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
        HashSet hashSet = dVar.f6210c;
        String str = dVar.f6209b;
        int i13 = dVar.f6208a;
        if (listQueryIntentActivities != null) {
            List<ResolveInfo> list = listQueryIntentActivities;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.L.f(((ResolveInfo) it.next()).activityInfo.packageName, "com.vkontakte.android")) {
                        Intent intent = new Intent("com.vkontakte.android.action.SDK_AUTH", (Uri) null);
                        intent.setPackage("com.vkontakte.android");
                        Bundle bundle = new Bundle();
                        bundle.putInt("client_id", i13);
                        bundle.putBoolean("revoke", true);
                        bundle.putString("scope", C42745f0.O(hashSet, ",", null, null, null, 62));
                        bundle.putString("redirect_url", str);
                        intent.putExtras(bundle);
                        socialActivity.startActivityForResult(intent, 282);
                        return;
                    }
                }
            }
        }
        VKWebViewAuthActivity.f366699e.getClass();
        Intent intent2 = new Intent(socialActivity, (Class<?>) VKWebViewAuthActivity.class);
        Bundle bundleE = AK.c.e(i13, "vk_app_id");
        ArrayList arrayList = new ArrayList(C42745f0.q(hashSet, 10));
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((VKScope) it2.next()).name());
        }
        bundleE.putStringArrayList("vk_app_scope", new ArrayList<>(arrayList));
        bundleE.putString("vk_app_redirect_url", str);
        socialActivity.startActivityForResult(intent2.putExtra("vk_auth_params", bundleE), 282);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018c  */
    @Override // com.avito.android.social.D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(int r17, int r18, @Y61.l android.content.Intent r19, @Y61.l Y41.l<? super com.avito.android.social.D.b, kotlin.G0> r20) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.social.Y.g(int, int, android.content.Intent, Y41.l):boolean");
    }

    @Override // com.avito.android.social.InterfaceC35021m
    @Y61.k
    public final SocialType getType() {
        return SocialType.f284284g;
    }
}

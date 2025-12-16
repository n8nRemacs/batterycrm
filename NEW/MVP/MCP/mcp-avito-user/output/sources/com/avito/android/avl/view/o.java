package com.avito.android.avl.view;

import android.app.PendingIntent;
import android.content.Intent;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvlPlayerActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "shareUrl", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class o extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AvlPlayerActivity f98397l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AvlPlayerActivity avlPlayerActivity) {
        super(1);
        this.f98397l = avlPlayerActivity;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        AvlPlayerActivity avlPlayerActivity = this.f98397l;
        Class<?> cls = avlPlayerActivity.f98316u;
        if (cls == null) {
            cls = null;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(avlPlayerActivity, 123, new Intent(avlPlayerActivity, cls), 167772160);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        StringBuilder sbZ = androidx.appcompat.app.r.z(str2, "?sourceSessionId=");
        com.avito.android.avl_analytics.a aVar = avlPlayerActivity.f98309n;
        if (aVar == null) {
            aVar = null;
        }
        sbZ.append(aVar.getF98437c());
        intent.putExtra("android.intent.extra.TEXT", sbZ.toString());
        avlPlayerActivity.startActivity(Intent.createChooser(intent, null, broadcast.getIntentSender()));
        return G0.f406611a;
    }
}

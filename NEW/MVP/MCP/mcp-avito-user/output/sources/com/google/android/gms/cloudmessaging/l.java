package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f348825b;

    public /* synthetic */ l(q qVar) {
        this.f348825b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws RemoteException {
        final q qVar = this.f348825b;
        while (true) {
            synchronized (qVar) {
                try {
                    if (qVar.f348831b != 2) {
                        return;
                    }
                    if (qVar.f348834e.isEmpty()) {
                        qVar.c();
                        return;
                    }
                    final t<?> tVar = (t) qVar.f348834e.poll();
                    qVar.f348835f.put(tVar.f348839a, tVar);
                    qVar.f348836g.f348845b.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            q qVar2 = qVar;
                            int i12 = tVar.f348839a;
                            synchronized (qVar2) {
                                t<?> tVar2 = qVar2.f348835f.get(i12);
                                if (tVar2 != null) {
                                    qVar2.f348835f.remove(i12);
                                    tVar2.c(new zzq("Timed out waiting for response", null));
                                    qVar2.c();
                                }
                            }
                        }
                    }, 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        new StringBuilder(String.valueOf(tVar).length() + 8);
                    }
                    Context context = qVar.f348836g.f348844a;
                    Messenger messenger = qVar.f348832c;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = tVar.f348841c;
                    messageObtain.arg1 = tVar.f348839a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", tVar.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", tVar.f348842d);
                    messageObtain.setData(bundle);
                    try {
                        r rVar = qVar.f348833d;
                        Messenger messenger2 = rVar.f348837a;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            zzd zzdVar = rVar.f348838b;
                            if (zzdVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = zzdVar.f348857b;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e12) {
                        qVar.a(e12.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}

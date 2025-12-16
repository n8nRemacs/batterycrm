package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.compose.ui.graphics.colorspace.e;
import j.N;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* compiled from: LocalBroadcastManager.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f46969f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static a f46970g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f46971a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f46972b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, ArrayList<c>> f46973c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList<b> f46974d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public final Handler f46975e;

    /* compiled from: LocalBroadcastManager.java */
    /* renamed from: androidx.localbroadcastmanager.content.a$a, reason: collision with other inner class name */
    public class HandlerC1808a extends Handler {
        public HandlerC1808a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int size;
            b[] bVarArr;
            if (message.what != 1) {
                super.handleMessage(message);
                return;
            }
            a aVar = a.this;
            while (true) {
                synchronized (aVar.f46972b) {
                    try {
                        size = aVar.f46974d.size();
                        if (size <= 0) {
                            return;
                        }
                        bVarArr = new b[size];
                        aVar.f46974d.toArray(bVarArr);
                        aVar.f46974d.clear();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                for (int i12 = 0; i12 < size; i12++) {
                    b bVar = bVarArr[i12];
                    int size2 = bVar.f46978b.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        c cVar = bVar.f46978b.get(i13);
                        if (!cVar.f46982d) {
                            cVar.f46980b.onReceive(aVar.f46971a, bVar.f46977a);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: LocalBroadcastManager.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f46977a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<c> f46978b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f46977a = intent;
            this.f46978b = arrayList;
        }
    }

    /* compiled from: LocalBroadcastManager.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final IntentFilter f46979a;

        /* renamed from: b, reason: collision with root package name */
        public final BroadcastReceiver f46980b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f46981c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f46982d;

        public c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            this.f46979a = intentFilter;
            this.f46980b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sbQ = e.q(128, "Receiver{");
            sbQ.append(this.f46980b);
            sbQ.append(" filter=");
            sbQ.append(this.f46979a);
            if (this.f46982d) {
                sbQ.append(" DEAD");
            }
            sbQ.append("}");
            return sbQ.toString();
        }
    }

    public a(Context context) {
        this.f46971a = context;
        this.f46975e = new HandlerC1808a(context.getMainLooper());
    }

    @N
    public static a a(@N Context context) {
        a aVar;
        synchronized (f46969f) {
            try {
                if (f46970g == null) {
                    f46970g = new a(context.getApplicationContext());
                }
                aVar = f46970g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public final void b(@N BroadcastReceiver broadcastReceiver, @N IntentFilter intentFilter) {
        synchronized (this.f46972b) {
            try {
                c cVar = new c(broadcastReceiver, intentFilter);
                ArrayList<c> arrayList = this.f46972b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f46972b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i12 = 0; i12 < intentFilter.countActions(); i12++) {
                    String action = intentFilter.getAction(i12);
                    ArrayList<c> arrayList2 = this.f46973c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f46973c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(@N Intent intent) {
        int i12;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        boolean z12;
        synchronized (this.f46972b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f46971a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z13 = false;
                boolean z14 = (intent.getFlags() & 8) != 0;
                if (z14) {
                    intent.toString();
                }
                ArrayList<c> arrayList3 = this.f46973c.get(intent.getAction());
                if (arrayList3 != null) {
                    if (z14) {
                        arrayList3.toString();
                    }
                    ArrayList arrayList4 = null;
                    int i13 = 0;
                    while (i13 < arrayList3.size()) {
                        c cVar = arrayList3.get(i13);
                        if (z14) {
                            Objects.toString(cVar.f46979a);
                        }
                        if (cVar.f46981c) {
                            i12 = i13;
                            arrayList2 = arrayList3;
                            str = action;
                            str2 = strResolveTypeIfNeeded;
                            arrayList = arrayList4;
                            z12 = z13;
                        } else {
                            IntentFilter intentFilter = cVar.f46979a;
                            String str3 = action;
                            String str4 = strResolveTypeIfNeeded;
                            i12 = i13;
                            str = action;
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            str2 = strResolveTypeIfNeeded;
                            z12 = z13;
                            int iMatch = intentFilter.match(str3, str4, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z14) {
                                    Integer.toHexString(iMatch);
                                }
                                arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                arrayList4.add(cVar);
                                cVar.f46981c = true;
                            }
                            i13 = i12 + 1;
                            z13 = z12;
                            action = str;
                            arrayList3 = arrayList2;
                            strResolveTypeIfNeeded = str2;
                        }
                        arrayList4 = arrayList;
                        i13 = i12 + 1;
                        z13 = z12;
                        action = str;
                        arrayList3 = arrayList2;
                        strResolveTypeIfNeeded = str2;
                    }
                    ArrayList arrayList5 = arrayList4;
                    boolean z15 = z13;
                    if (arrayList5 != null) {
                        for (int i14 = z15 ? 1 : 0; i14 < arrayList5.size(); i14++) {
                            ((c) arrayList5.get(i14)).f46981c = z15;
                        }
                        this.f46974d.add(new b(intent, arrayList5));
                        if (!this.f46975e.hasMessages(1)) {
                            this.f46975e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(@N BroadcastReceiver broadcastReceiver) {
        synchronized (this.f46972b) {
            try {
                ArrayList<c> arrayListRemove = this.f46972b.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    c cVar = arrayListRemove.get(size);
                    cVar.f46982d = true;
                    for (int i12 = 0; i12 < cVar.f46979a.countActions(); i12++) {
                        String action = cVar.f46979a.getAction(i12);
                        ArrayList<c> arrayList = this.f46973c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = arrayList.get(size2);
                                if (cVar2.f46980b == broadcastReceiver) {
                                    cVar2.f46982d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f46973c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

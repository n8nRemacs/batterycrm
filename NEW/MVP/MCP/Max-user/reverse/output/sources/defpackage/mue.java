package defpackage;

import android.net.Uri;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.android.util.share.ShareData;

/* loaded from: classes2.dex */
public final class mue {
    public final dd a;
    public final tw0 b;
    public final yi5 c;
    public final c6i d;

    public mue(dd ddVar, tw0 tw0Var, q85 q85Var, yi5 yi5Var, c6i c6iVar) {
        this.a = ddVar;
        this.b = tw0Var;
        this.c = yi5Var;
        this.d = c6iVar;
    }

    public final ArrayList a(int i, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (uri == null || l8g.c(uri.toString())) {
                wqi.e("mue", "Failed to send media, uri is empty or null", null);
            } else {
                if (i == 7) {
                    this.a.f("ACTION_FILE_SEND", "share");
                }
                l1f l1fVar = new l1f(i, uri.toString());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(l1fVar);
                dhe dheVar = new dhe(0L, arrayList2);
                dheVar.j = true;
                dheVar.h = str;
                dheVar.i = null;
                arrayList.add(dheVar);
            }
        }
        return arrayList;
    }

    public final void b(ShareData shareData, List list, String str, List list2) {
        List listSingletonList;
        wqi.c("mue", "share", new Object[0]);
        if (shareData == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = shareData.type;
        hd5 hd5Var = hd5.a;
        if (i == 0 && !l8g.c(shareData.text)) {
            arrayList.add(new jhe(0L, shareData.text.trim(), true, hd5Var));
        }
        String str2 = null;
        if (shareData.images != null) {
            if (shareData.isSingleMedia()) {
                arrayList.addAll(a(1, shareData.text, shareData.images));
            } else {
                if (!l8g.c(shareData.text)) {
                    arrayList.add(new jhe(0L, shareData.text.trim(), true, hd5Var));
                }
                arrayList.addAll(a(1, null, shareData.images));
            }
        }
        List<Uri> list3 = shareData.videos;
        if (list3 != null) {
            if (shareData.isSingleMedia()) {
                arrayList.addAll(a(3, shareData.text, list3));
            } else {
                if (!l8g.c(shareData.text)) {
                    arrayList.add(new jhe(0L, shareData.text.trim(), true, hd5Var));
                }
                arrayList.addAll(a(3, null, list3));
            }
        }
        if (shareData.files != null) {
            if (!l8g.c(shareData.text)) {
                arrayList.add(new jhe(0L, shareData.text.trim(), true, hd5Var));
            }
            arrayList.addAll(a(7, null, shareData.files));
        }
        List<Uri> list4 = shareData.shares;
        if (list4 != null) {
            String str3 = shareData.text;
            ArrayList arrayList2 = new ArrayList(list4.size());
            Iterator<Uri> it = list4.iterator();
            while (it.hasNext()) {
                Uri next = it.next();
                String strValueOf = next != null ? String.valueOf(next) : str2;
                if (!l8g.c(strValueOf)) {
                    int i2 = w10.B;
                    x00 x00Var = new x00();
                    x00Var.a = s10.Y;
                    o10 o10Var = new o10();
                    o10Var.b = strValueOf;
                    x00Var.g = new o10(o10Var);
                    w10 w10VarA = x00Var.a();
                    if (!l8g.c(str3)) {
                        strValueOf = str3;
                    }
                    jhe jheVar = new jhe(0L, strValueOf, w10VarA);
                    jheVar.i = true;
                    arrayList2.add(jheVar);
                }
                str2 = null;
            }
            arrayList.addAll(arrayList2);
        }
        if (!l8g.c(shareData.vcard)) {
            String str4 = shareData.vcard;
            if (l8g.c(str4)) {
                listSingletonList = Collections.EMPTY_LIST;
            } else {
                zge zgeVar = new zge(0L);
                zgeVar.g = str4;
                listSingletonList = Collections.singletonList(zgeVar);
            }
            arrayList.addAll(listSingletonList);
        }
        if (str != null) {
            String strTrim = str.trim();
            if (!arrayList.isEmpty() && !l8g.c(strTrim)) {
                arrayList.add(0, new jhe(0L, strTrim, true, list2 == null ? hd5Var : list2));
            }
        }
        wqi.c("mue", "share: queue size = %d; chats count = %d", Integer.valueOf(arrayList.size()), Integer.valueOf(list.size()));
        if (arrayList.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((Long) it2.next()).getClass();
                this.b.c(new gde("file.local.unknown.error"));
            }
            ((y3b) this.c).a(new IllegalStateException(String.format("Try to share empty queue. Description = %s chats size = %d, shareData = %s", str, Integer.valueOf(list.size()), shareData)));
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque(arrayList.size());
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayDeque.add(((fhe) it3.next()).a());
        }
        wqi.c("q85", "tasks size = %d", Integer.valueOf(arrayDeque.size()));
        for (int i3 = 0; i3 < list.size(); i3++) {
            lge lgeVar = new lge(((Long) list.get(i3)).longValue(), new ArrayDeque(arrayDeque), 2);
            lgeVar.e = null;
            this.d.b(new ihe(lgeVar));
        }
    }
}

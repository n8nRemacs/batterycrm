package defpackage;

import android.database.Cursor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class brd implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dsd b;
    public final /* synthetic */ drd c;

    public /* synthetic */ brd(drd drdVar, dsd dsdVar, int i) {
        this.a = i;
        this.c = drdVar;
        this.b = dsdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v3, types: [uqd] */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        Cursor cursorN;
        List listA;
        Set setC;
        n8a n8aVar;
        dsd dsdVar;
        int i;
        byte[] blob;
        int i2;
        List listA2;
        int i3;
        Set setC2;
        int i4;
        int i5;
        n8a n8aVar2;
        List list;
        int i6;
        int i7;
        String string;
        int i8 = this.a;
        Set set = rd5.a;
        List list2 = hd5.a;
        dsd dsdVar2 = this.b;
        drd drdVar = this.c;
        switch (i8) {
            case 0:
                cursorN = drdVar.a.n(dsdVar2);
                try {
                    int iC = s7j.c(cursorN, "id");
                    int iC2 = s7j.c(cursorN, "title");
                    int iC3 = s7j.c(cursorN, "order");
                    int iC4 = s7j.c(cursorN, "emoji");
                    int iC5 = s7j.c(cursorN, "filters");
                    int iC6 = s7j.c(cursorN, "isHiddenForAllFolder");
                    int iC7 = s7j.c(cursorN, "elements");
                    int iC8 = s7j.c(cursorN, "filterSubjects");
                    int iC9 = s7j.c(cursorN, "widgets");
                    int iC10 = s7j.c(cursorN, "options");
                    int iC11 = s7j.c(cursorN, "updateTime");
                    int iC12 = s7j.c(cursorN, "favorites");
                    int iC13 = s7j.c(cursorN, "templateId");
                    int iC14 = s7j.c(cursorN, "sourceId");
                    if (cursorN.moveToFirst()) {
                        String string2 = cursorN.isNull(iC) ? null : cursorN.getString(iC);
                        String string3 = cursorN.isNull(iC2) ? null : cursorN.getString(iC2);
                        int i9 = cursorN.getInt(iC3);
                        String string4 = cursorN.isNull(iC4) ? null : cursorN.getString(iC4);
                        EnumSet enumSetK = uzi.k(cursorN.isNull(iC5) ? null : cursorN.getString(iC5));
                        boolean z = cursorN.getInt(iC6) != 0;
                        byte[] blob2 = cursorN.isNull(iC7) ? null : cursorN.getBlob(iC7);
                        if (blob2 != null) {
                            Protos.MessageElements messageElements = new Protos.MessageElements();
                            fl9.mergeFrom(messageElements, blob2);
                            listA = dj9.a(messageElements.elements);
                        } else {
                            listA = list2;
                        }
                        Map mapB = uzi.b(cursorN.isNull(iC8) ? null : cursorN.getBlob(iC8));
                        List listC = uzi.c(cursorN.isNull(iC9) ? null : cursorN.getBlob(iC9));
                        byte[] blob3 = cursorN.isNull(iC10) ? null : cursorN.getBlob(iC10);
                        if (blob3 != null) {
                            hd6 hd6Var = new hd6(1);
                            fl9.mergeFrom(hd6Var, blob3);
                            setC = lsi.c(hd6Var);
                        } else {
                            setC = set;
                        }
                        long j = cursorN.getLong(iC11);
                        byte[] blob4 = cursorN.isNull(iC12) ? null : cursorN.getBlob(iC12);
                        if (blob4 == null || blob4.length == 0) {
                            n8aVar = null;
                        } else {
                            ByteBuffer byteBufferWrap = ByteBuffer.wrap(blob4);
                            n8a n8aVarA = dk8.a();
                            while (byteBufferWrap.remaining() >= 8) {
                                long j2 = byteBufferWrap.getLong();
                                n8aVarA.b[n8aVarA.e(j2)] = j2;
                            }
                            n8aVar = n8aVarA;
                        }
                        uqdVar = new uqd(string2, string3, i9, string4, enumSetK, z, listA, mapB, listC, setC, j, n8aVar, cursorN.isNull(iC13) ? null : Long.valueOf(cursorN.getLong(iC13)), cursorN.isNull(iC14) ? null : Long.valueOf(cursorN.getLong(iC14)));
                    }
                    return uqdVar;
                } finally {
                }
            case 1:
                cursorN = drdVar.a.n(dsdVar2);
                try {
                    ArrayList arrayList = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        arrayList.add(cursorN.isNull(0) ? null : Long.valueOf(cursorN.getLong(0)));
                    }
                    return arrayList;
                } finally {
                }
            default:
                Cursor cursorN2 = drdVar.a.n(dsdVar2);
                try {
                    int iC15 = s7j.c(cursorN2, "id");
                    int iC16 = s7j.c(cursorN2, "title");
                    int iC17 = s7j.c(cursorN2, "order");
                    int iC18 = s7j.c(cursorN2, "emoji");
                    int iC19 = s7j.c(cursorN2, "filters");
                    int iC20 = s7j.c(cursorN2, "isHiddenForAllFolder");
                    int iC21 = s7j.c(cursorN2, "elements");
                    int iC22 = s7j.c(cursorN2, "filterSubjects");
                    int iC23 = s7j.c(cursorN2, "widgets");
                    int iC24 = s7j.c(cursorN2, "options");
                    int iC25 = s7j.c(cursorN2, "updateTime");
                    int iC26 = s7j.c(cursorN2, "favorites");
                    int iC27 = s7j.c(cursorN2, "templateId");
                    int iC28 = s7j.c(cursorN2, "sourceId");
                    dsdVar = dsdVar2;
                    try {
                        int iC29 = s7j.c(cursorN2, ApiProtocol.PARAM_CHAT_ID);
                        int iC30 = s7j.c(cursorN2, "folderId");
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        while (cursorN2.moveToNext()) {
                            String string5 = cursorN2.isNull(iC15) ? null : cursorN2.getString(iC15);
                            String string6 = cursorN2.isNull(iC16) ? null : cursorN2.getString(iC16);
                            int i10 = cursorN2.getInt(iC17);
                            String string7 = cursorN2.isNull(iC18) ? null : cursorN2.getString(iC18);
                            EnumSet enumSetK2 = uzi.k(cursorN2.isNull(iC19) ? null : cursorN2.getString(iC19));
                            boolean z2 = cursorN2.getInt(iC20) != 0;
                            if (cursorN2.isNull(iC21)) {
                                i = iC16;
                                blob = null;
                            } else {
                                i = iC16;
                                blob = cursorN2.getBlob(iC21);
                            }
                            if (blob != null) {
                                i2 = iC15;
                                Protos.MessageElements messageElements2 = new Protos.MessageElements();
                                fl9.mergeFrom(messageElements2, blob);
                                listA2 = dj9.a(messageElements2.elements);
                            } else {
                                i2 = iC15;
                                listA2 = list2;
                            }
                            Map mapB2 = uzi.b(cursorN2.isNull(iC22) ? null : cursorN2.getBlob(iC22));
                            List listC2 = uzi.c(cursorN2.isNull(iC23) ? null : cursorN2.getBlob(iC23));
                            byte[] blob5 = cursorN2.isNull(iC24) ? null : cursorN2.getBlob(iC24);
                            if (blob5 != null) {
                                i3 = iC24;
                                hd6 hd6Var2 = new hd6(1);
                                fl9.mergeFrom(hd6Var2, blob5);
                                setC2 = lsi.c(hd6Var2);
                            } else {
                                i3 = iC24;
                                setC2 = set;
                            }
                            long j3 = cursorN2.getLong(iC25);
                            byte[] blob6 = cursorN2.isNull(iC26) ? null : cursorN2.getBlob(iC26);
                            if (blob6 == null || blob6.length == 0) {
                                i4 = iC26;
                                i5 = iC25;
                                n8aVar2 = null;
                            } else {
                                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(blob6);
                                n8a n8aVarA2 = dk8.a();
                                while (true) {
                                    ByteBuffer byteBuffer = byteBufferWrap2;
                                    if (byteBufferWrap2.remaining() >= 8) {
                                        int i11 = iC26;
                                        long j4 = byteBuffer.getLong();
                                        n8aVarA2.b[n8aVarA2.e(j4)] = j4;
                                        iC26 = i11;
                                        byteBufferWrap2 = byteBuffer;
                                        iC25 = iC25;
                                    } else {
                                        i4 = iC26;
                                        i5 = iC25;
                                        n8aVar2 = n8aVarA2;
                                    }
                                }
                            }
                            uqd uqdVar = new uqd(string5, string6, i10, string7, enumSetK2, z2, listA2, mapB2, listC2, setC2, j3, n8aVar2, cursorN2.isNull(iC27) ? null : Long.valueOf(cursorN2.getLong(iC27)), cursorN2.isNull(iC28) ? null : Long.valueOf(cursorN2.getLong(iC28)));
                            if (linkedHashMap.containsKey(uqdVar)) {
                                list = (List) linkedHashMap.get(uqdVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                linkedHashMap.put(uqdVar, arrayList2);
                                list = arrayList2;
                            }
                            int i12 = iC29;
                            if (cursorN2.isNull(i12)) {
                                i6 = iC30;
                                if (cursorN2.isNull(i6)) {
                                    iC29 = i12;
                                    iC30 = i6;
                                    iC26 = i4;
                                    iC15 = i2;
                                }
                                iC16 = i;
                                iC24 = i3;
                                iC25 = i5;
                            } else {
                                i6 = iC30;
                            }
                            int i13 = i4;
                            long j5 = cursorN2.getLong(i12);
                            if (cursorN2.isNull(i6)) {
                                i7 = iC28;
                                string = null;
                            } else {
                                i7 = iC28;
                                string = cursorN2.getString(i6);
                            }
                            list.add(new ic2(j5, string));
                            iC30 = i6;
                            iC26 = i13;
                            iC29 = i12;
                            iC15 = i2;
                            iC28 = i7;
                            iC16 = i;
                            iC24 = i3;
                            iC25 = i5;
                        }
                        cursorN2.close();
                        dsdVar.y();
                        return linkedHashMap;
                    } catch (Throwable th) {
                        th = th;
                        cursorN2.close();
                        dsdVar.y();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dsdVar = dsdVar2;
                }
                break;
        }
    }
}

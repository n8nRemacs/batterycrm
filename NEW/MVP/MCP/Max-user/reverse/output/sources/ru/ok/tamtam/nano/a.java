package ru.ok.tamtam.nano;

import defpackage.az1;
import defpackage.cf8;
import defpackage.df2;
import defpackage.ex0;
import defpackage.fmd;
import defpackage.gx0;
import defpackage.hmd;
import defpackage.i10;
import defpackage.imd;
import defpackage.j10;
import defpackage.jdc;
import defpackage.jei;
import defpackage.jf2;
import defpackage.k10;
import defpackage.l8g;
import defpackage.rha;
import defpackage.vw0;
import defpackage.wqi;
import defpackage.x10;
import defpackage.xl7;
import defpackage.ye2;
import defpackage.yl7;
import defpackage.yw0;
import defpackage.ze2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public abstract class a {
    public static final byte[] a = new byte[0];

    static {
        jei.a = new rha(27);
    }

    public static HashMap a(Map map) {
        HashMap map2 = new HashMap(map.size());
        for (Long l : map.keySet()) {
            Protos.Chat.AdminParticipant adminParticipant = (Protos.Chat.AdminParticipant) map.get(l);
            ye2 ye2Var = new ye2();
            ye2Var.b = adminParticipant.id;
            ye2Var.a = adminParticipant.permissions;
            ye2Var.c = adminParticipant.inviterId;
            ye2Var.d = adminParticipant.alias;
            map2.put(l, new ze2(ye2Var));
        }
        return map2;
    }

    public static int b(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 1 : 6;
        }
        return 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.w10 c(ru.ok.tamtam.nano.Protos.Attaches.Attach r30) {
        /*
            Method dump skipped, instructions count: 1482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.nano.a.c(ru.ok.tamtam.nano.Protos$Attaches$Attach):w10");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ru.ok.tamtam.nano.Protos.Attaches.Attach d(defpackage.w10 r18) {
        /*
            Method dump skipped, instructions count: 1542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.nano.a.d(w10):ru.ok.tamtam.nano.Protos$Attaches$Attach");
    }

    public static jdc e(Protos.Attaches attaches) {
        Protos.Attaches.Attach.InlineKeyboard inlineKeyboard;
        x10 x10Var = new x10();
        Protos.Attaches.Attach.InlineKeyboard inlineKeyboard2 = attaches.keyboard;
        if (inlineKeyboard2 != null) {
            x10Var.b = k(inlineKeyboard2);
        }
        Protos.Attaches.Attach.ReplyKeyboard replyKeyboard = attaches.replyKeyboard;
        if (replyKeyboard != null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                Protos.Attaches.Attach.ReplyButtons[] replyButtonsArr = replyKeyboard.buttons;
                if (i >= replyButtonsArr.length) {
                    break;
                }
                Protos.Attaches.Attach.ReplyButtons replyButtons = replyButtonsArr[i];
                if (replyButtons != null) {
                    arrayList.add(new hmd());
                    int i2 = 0;
                    while (true) {
                        Protos.Attaches.Attach.ReplyButton[] replyButtonArr = replyButtons.replyButton;
                        if (i2 < replyButtonArr.length) {
                            Protos.Attaches.Attach.ReplyButton replyButton = replyButtonArr[i2];
                            if (replyButton != null) {
                                hmd hmdVar = (hmd) arrayList.get(i);
                                int i3 = replyButton.type;
                                int i4 = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? 5 : 4 : 3 : 2 : 1;
                                int i5 = replyButton.intent;
                                int i6 = i5 != 0 ? i5 != 1 ? i5 != 2 ? 4 : 3 : 2 : 1;
                                Protos.Attaches.Attach.Photo photo = replyButton.image;
                                hmdVar.add(new fmd(i4, i6, replyButton.text, photo != null ? n(photo) : null, replyButton.outgoingMessageId));
                            }
                            i2++;
                        }
                    }
                }
                i++;
            }
            x10Var.c = new imd(arrayList, replyKeyboard.defaultInputDisabled);
        }
        for (Protos.Attaches.Attach attach : attaches.attach) {
            if (x10Var.b != null || (inlineKeyboard = attach.inlineKeyboard) == null) {
                x10Var.a(c(attach));
            } else {
                x10Var.b = k(inlineKeyboard);
            }
        }
        return x10Var.c();
    }

    public static Protos.Attaches f(jdc jdcVar) {
        Protos.Attaches attaches = new Protos.Attaches();
        int size = ((List) jdcVar.b).size();
        Protos.Attaches.Attach[] attachArr = new Protos.Attaches.Attach[size];
        for (int i = 0; i < size; i++) {
            attachArr[i] = d(jdcVar.o(i));
        }
        attaches.attach = attachArr;
        yl7 yl7Var = (yl7) jdcVar.c;
        if (yl7Var != null) {
            attaches.keyboard = l(yl7Var);
        }
        imd imdVar = (imd) jdcVar.d;
        if (imdVar != null) {
            Protos.Attaches.Attach.ReplyKeyboard replyKeyboard = new Protos.Attaches.Attach.ReplyKeyboard();
            ArrayList arrayList = imdVar.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                List<fmd> list = (List) it.next();
                ArrayList arrayList3 = new ArrayList();
                arrayList2.add(arrayList3);
                for (fmd fmdVar : list) {
                    Protos.Attaches.Attach.ReplyButton replyButton = new Protos.Attaches.Attach.ReplyButton();
                    int iV = az1.v(fmdVar.b);
                    int i2 = 1;
                    replyButton.intent = iV != 0 ? iV != 1 ? iV != 2 ? 3 : 2 : 1 : 0;
                    int iV2 = az1.v(fmdVar.a);
                    if (iV2 == 0) {
                        i2 = 0;
                    } else if (iV2 != 1) {
                        i2 = iV2 != 2 ? 3 : 2;
                    }
                    replyButton.type = i2;
                    String str = fmdVar.c;
                    if (str == null) {
                        str = "";
                    }
                    replyButton.text = str;
                    replyButton.outgoingMessageId = fmdVar.e;
                    k10 k10Var = fmdVar.d;
                    if (k10Var != null) {
                        replyButton.image = o(k10Var);
                    }
                    arrayList3.add(replyButton);
                }
            }
            Protos.Attaches.Attach.ReplyButtons[] replyButtonsArr = new Protos.Attaches.Attach.ReplyButtons[arrayList2.size()];
            Protos.Attaches.Attach.ReplyButton[] replyButtonArr = new Protos.Attaches.Attach.ReplyButton[0];
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                Protos.Attaches.Attach.ReplyButtons replyButtons = new Protos.Attaches.Attach.ReplyButtons();
                replyButtons.replyButton = (Protos.Attaches.Attach.ReplyButton[]) ((List) arrayList2.get(i3)).toArray(replyButtonArr);
                replyButtonsArr[i3] = replyButtons;
            }
            replyKeyboard.buttons = replyButtonsArr;
            replyKeyboard.defaultInputDisabled = imdVar.b;
            attaches.replyKeyboard = replyKeyboard;
        }
        return attaches;
    }

    public static df2 g(Protos.Chat.ChatMedia chatMedia) {
        int i = chatMedia.totalCount;
        long j = chatMedia.firstMessageId;
        long j2 = chatMedia.lastMessageId;
        Protos.Chat.Chunk chunk = chatMedia.chunk;
        List arrayList = null;
        jf2 jf2VarI = chunk != null ? i(chunk) : null;
        Protos.Chat.Chunk[] chunkArr = chatMedia.chunks;
        if (chunkArr != null && chunkArr.length > 0) {
            for (Protos.Chat.Chunk chunk2 : chunkArr) {
                jf2 jf2VarI2 = i(chunk2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(jf2VarI2);
            }
        }
        if (arrayList == null) {
            arrayList = Collections.EMPTY_LIST;
        }
        return new df2(jf2VarI, i, j, j2, arrayList);
    }

    public static Protos.Chat.ChatMedia h(df2 df2Var) {
        Protos.Chat.ChatMedia chatMedia = new Protos.Chat.ChatMedia();
        long j = df2Var.c;
        List list = df2Var.e;
        chatMedia.firstMessageId = j;
        chatMedia.lastMessageId = df2Var.d;
        chatMedia.totalCount = df2Var.b;
        jf2 jf2Var = df2Var.a;
        if (jf2Var != null) {
            chatMedia.chunk = j(jf2Var);
        }
        if (list.size() > 0) {
            chatMedia.chunks = new Protos.Chat.Chunk[list.size()];
            for (int i = 0; i < list.size(); i++) {
                chatMedia.chunks[i] = j((jf2) list.get(i));
            }
        }
        return chatMedia;
    }

    public static jf2 i(Protos.Chat.Chunk chunk) {
        long j = chunk.startTime;
        if (j == -1) {
            wqi.p("Chunk.Builder", "", new IllegalStateException("start time is -1"));
        }
        long j2 = chunk.endTime;
        if (j2 == -1) {
            wqi.p("Chunk.Builder", "", new IllegalStateException("end time is -1"));
        }
        return new jf2(j, j2);
    }

    public static Protos.Chat.Chunk j(jf2 jf2Var) {
        Protos.Chat.Chunk chunk = new Protos.Chat.Chunk();
        chunk.startTime = jf2Var.a;
        chunk.endTime = jf2Var.b;
        return chunk;
    }

    public static yl7 k(Protos.Attaches.Attach.InlineKeyboard inlineKeyboard) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            Protos.Attaches.Attach.Buttons[] buttonsArr = inlineKeyboard.buttons;
            if (i >= buttonsArr.length) {
                xl7 xl7Var = new xl7();
                xl7Var.a = arrayList;
                xl7Var.b = inlineKeyboard.callbackId;
                return new yl7(xl7Var);
            }
            Protos.Attaches.Attach.Buttons buttons = buttonsArr[i];
            arrayList.add(new ex0());
            int i2 = 0;
            while (true) {
                Protos.Attaches.Attach.Button[] buttonArr = buttons.button;
                if (i2 < buttonArr.length) {
                    Protos.Attaches.Attach.Button button = buttonArr[i2];
                    ex0 ex0Var = (ex0) arrayList.get(i);
                    int i3 = button.type;
                    int i4 = 3;
                    gx0 gx0Var = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 5 ? i3 != 6 ? i3 != 7 ? gx0.UNKNOWN : gx0.OPEN_APP : gx0.MESSAGE : gx0.CHAT : gx0.REQUEST_GEO_LOCATION : gx0.REQUEST_CONTACT : gx0.LINK : gx0.CALLBACK;
                    int i5 = button.intent;
                    if (i5 == 0) {
                        i4 = 1;
                    } else if (i5 == 1) {
                        i4 = 2;
                    } else if (i5 != 2) {
                        i4 = 4;
                    }
                    String str = button.title;
                    String str2 = button.url;
                    String str3 = button.payload;
                    boolean z = button.quickLocation;
                    long j = button.contactId;
                    boolean z2 = button.showLoading;
                    vw0 vw0Var = new vw0(str, gx0Var, i4);
                    vw0Var.d = str2;
                    vw0Var.e = str3;
                    vw0Var.h = j;
                    vw0Var.f = z;
                    vw0Var.g = z2;
                    ex0Var.add(new yw0(vw0Var));
                    i2++;
                }
            }
            i++;
        }
    }

    public static Protos.Attaches.Attach.InlineKeyboard l(yl7 yl7Var) {
        Protos.Attaches.Attach.InlineKeyboard inlineKeyboard = new Protos.Attaches.Attach.InlineKeyboard();
        ArrayList arrayList = yl7Var.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                Protos.Attaches.Attach.Buttons[] buttonsArr = new Protos.Attaches.Attach.Buttons[arrayList2.size()];
                Protos.Attaches.Attach.Button[] buttonArr = new Protos.Attaches.Attach.Button[0];
                for (int i = 0; i < arrayList2.size(); i++) {
                    Protos.Attaches.Attach.Buttons buttons = new Protos.Attaches.Attach.Buttons();
                    buttons.button = (Protos.Attaches.Attach.Button[]) ((List) arrayList2.get(i)).toArray(buttonArr);
                    buttonsArr[i] = buttons;
                }
                inlineKeyboard.buttons = buttonsArr;
                String str = yl7Var.b;
                inlineKeyboard.callbackId = str != null ? str : "";
                return inlineKeyboard;
            }
            List<yw0> list = (List) it.next();
            ArrayList arrayList3 = new ArrayList();
            arrayList2.add(arrayList3);
            for (yw0 yw0Var : list) {
                Protos.Attaches.Attach.Button button = new Protos.Attaches.Attach.Button();
                int iV = az1.v(yw0Var.c);
                int i2 = 1;
                button.intent = iV != 0 ? iV != 1 ? iV != 2 ? 3 : 2 : 1 : 0;
                switch (yw0Var.b) {
                    case CALLBACK:
                        i2 = 0;
                        break;
                    case LINK:
                        break;
                    case REQUEST_CONTACT:
                        i2 = 2;
                        break;
                    case REQUEST_GEO_LOCATION:
                        i2 = 3;
                        break;
                    case CHAT:
                        i2 = 5;
                        break;
                    case OPEN_APP:
                        i2 = 7;
                        break;
                    case MESSAGE:
                        i2 = 6;
                        break;
                    default:
                        i2 = 4;
                        break;
                }
                button.type = i2;
                String str2 = yw0Var.a;
                if (str2 == null) {
                    str2 = "";
                }
                button.title = str2;
                String str3 = yw0Var.d;
                if (str3 == null) {
                    str3 = "";
                }
                button.url = str3;
                String str4 = yw0Var.o;
                if (str4 == null) {
                    str4 = "";
                }
                button.payload = str4;
                button.showLoading = yw0Var.Z;
                button.quickLocation = yw0Var.X;
                button.contactId = yw0Var.Y;
                arrayList3.add(button);
            }
        }
    }

    public static Protos.Attaches.LocationInfo m(i10 i10Var) {
        Protos.Attaches.LocationInfo locationInfo = new Protos.Attaches.LocationInfo();
        cf8 cf8Var = i10Var.a;
        locationInfo.latitude = cf8Var.a;
        locationInfo.longitude = cf8Var.b;
        locationInfo.altitude = cf8Var.c;
        locationInfo.accuracy = cf8Var.d;
        locationInfo.bearing = cf8Var.o;
        locationInfo.speed = cf8Var.X;
        locationInfo.time = i10Var.b;
        return locationInfo;
    }

    public static k10 n(Protos.Attaches.Attach.Photo photo) {
        k10 k10Var = k10.v0;
        j10 j10Var = new j10();
        j10Var.a = photo.baseUrl;
        j10Var.b = photo.photoUrl;
        j10Var.c = photo.width;
        j10Var.d = photo.height;
        j10Var.e = photo.gif;
        j10Var.f = photo.previewData;
        j10Var.g = photo.photoToken;
        j10Var.h = photo.photoId;
        j10Var.i = photo.mp4Url;
        j10Var.k = l8g.c(photo.previewUrl) ? null : photo.previewUrl;
        j10Var.j = photo.externalGifId;
        return new k10(j10Var);
    }

    public static Protos.Attaches.Attach.Photo o(k10 k10Var) {
        Protos.Attaches.Attach.Photo photo = new Protos.Attaches.Attach.Photo();
        String str = k10Var.a;
        if (str == null) {
            str = "";
        }
        photo.baseUrl = str;
        String str2 = k10Var.b;
        if (str2 == null) {
            str2 = "";
        }
        photo.photoUrl = str2;
        photo.width = k10Var.c;
        photo.height = k10Var.d;
        photo.gif = k10Var.o;
        byte[] bArr = k10Var.X;
        if (bArr != null) {
            photo.previewData = bArr;
        }
        String str3 = k10Var.u0;
        if (str3 == null) {
            str3 = "";
        }
        photo.previewUrl = str3;
        String str4 = k10Var.Y;
        if (str4 == null) {
            str4 = "";
        }
        photo.photoToken = str4;
        photo.photoId = k10Var.Z;
        String str5 = k10Var.s0;
        if (str5 == null) {
            str5 = "";
        }
        photo.mp4Url = str5;
        String str6 = k10Var.t0;
        photo.externalGifId = str6 != null ? str6 : "";
        return photo;
    }

    public static int p(int i) {
        int iV = az1.v(i);
        int i2 = 1;
        if (iV != 1) {
            i2 = 2;
            if (iV != 2) {
                i2 = 3;
                if (iV != 3) {
                    i2 = 4;
                    if (iV != 4) {
                        i2 = 5;
                        if (iV != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }
}

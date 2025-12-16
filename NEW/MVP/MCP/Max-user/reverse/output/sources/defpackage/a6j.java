package defpackage;

import android.content.Context;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.a;

/* loaded from: classes.dex */
public abstract class a6j {
    public static zv3 a(byte[] bArr) throws ProtoException {
        yv3 yv3Var;
        int i;
        byte[] bArr2 = a.a;
        try {
            Protos.Contact contact = (Protos.Contact) fl9.mergeFrom(new Protos.Contact(), bArr);
            rv3 rv3Var = new rv3();
            rv3Var.a = contact.serverId;
            rv3Var.b = contact.baseUrl;
            rv3Var.c = contact.baseRawUrl;
            rv3Var.d = contact.deviceAvatarUrl;
            rv3Var.e = contact.photoId;
            rv3Var.g = contact.lastUpdateTime;
            rv3Var.h = contact.serverPhone;
            rv3Var.m = contact.settings;
            rv3Var.o = contact.description;
            rv3Var.p = contact.link;
            rv3Var.q = contact.birthday;
            rv3Var.r = contact.lastSearchClickTime;
            rv3Var.s = contact.lastSyncTime;
            rv3Var.t = contact.lastShowingUnknownContactBar;
            rv3Var.v = contact.profileOptions;
            Protos.Contact.MenuButton menuButton = contact.menuButton;
            rv3Var.u = menuButton == null ? null : new uv3(menuButton.text);
            Protos.Contact.StartMessage startMessage = contact.startMessage;
            if (startMessage != null) {
                String str = startMessage.text;
                Protos.MessageElement[] messageElementArr = startMessage.elements;
                ArrayList arrayListA = (messageElementArr == null || messageElementArr.length <= 0) ? null : dj9.a(messageElementArr);
                Protos.Attaches.Attach attach = contact.startMessage.media;
                w10 w10VarC = attach != null ? a.c(attach) : null;
                if (str != null) {
                    rv3Var.w = new wv3(w10VarC, str, arrayListA);
                }
            }
            ArrayList arrayList = new ArrayList();
            Protos.Contact.ContactName[] contactNameArr = contact.names;
            if (contactNameArr != null && contactNameArr.length > 0) {
                for (Protos.Contact.ContactName contactName : contactNameArr) {
                    String str2 = contactName.name;
                    String str3 = contactName.lastName;
                    int i2 = contactName.type;
                    sv3 sv3Var = sv3.d;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            sv3Var = sv3.a;
                        } else if (i2 == 2) {
                            sv3Var = sv3.b;
                        } else if (i2 == 3) {
                            sv3Var = sv3.c;
                        }
                    }
                    arrayList.add(new tv3(str2, sv3Var, str3));
                }
            }
            rv3Var.f = arrayList;
            int i3 = contact.status;
            rv3Var.i = i3 != 1 ? i3 != 2 ? null : xv3.b : xv3.a;
            int i4 = contact.type;
            if (i4 == 0) {
                yv3Var = yv3.a;
            } else {
                if (i4 != 1) {
                    throw new IllegalArgumentException("unknown proto.type " + contact.type);
                }
                yv3Var = yv3.b;
            }
            rv3Var.k = yv3Var;
            int i5 = contact.gender;
            if (i5 == 0) {
                i = 1;
            } else if (i5 == 1) {
                i = 2;
            } else {
                if (i5 != 2) {
                    throw new IllegalArgumentException("unknown proto.gender " + contact.gender);
                }
                i = 3;
            }
            rv3Var.l = i;
            ArrayList arrayList2 = new ArrayList();
            int[] iArr = contact.options;
            if (iArr != null && iArr.length > 0) {
                int length = iArr.length;
                for (int i6 = 0; i6 < length; i6++) {
                    int i7 = iArr[i6];
                    arrayList2.add(i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? null : vv3.X : vv3.o : vv3.d : vv3.c : vv3.b : vv3.a);
                }
            }
            rv3Var.n = arrayList2;
            return rv3Var.a();
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }

    public static byte[] b(zv3 zv3Var) {
        int i;
        int i2;
        int i3;
        byte[] bArr = a.a;
        Protos.Contact contact = new Protos.Contact();
        long j = zv3Var.a;
        uv3 uv3Var = zv3Var.u;
        xv3 xv3Var = zv3Var.i;
        wv3 wv3Var = zv3Var.w;
        List list = zv3Var.n;
        List list2 = zv3Var.f;
        contact.serverId = j;
        String str = zv3Var.c;
        if (str == null) {
            str = "";
        }
        contact.baseUrl = str;
        String str2 = zv3Var.d;
        if (str2 == null) {
            str2 = "";
        }
        contact.baseRawUrl = str2;
        String str3 = zv3Var.b;
        if (str3 == null) {
            str3 = "";
        }
        contact.deviceAvatarUrl = str3;
        contact.photoId = zv3Var.e;
        contact.lastUpdateTime = zv3Var.g;
        contact.serverPhone = zv3Var.h;
        contact.settings = zv3Var.m;
        String str4 = zv3Var.o;
        if (str4 == null) {
            str4 = "";
        }
        contact.description = str4;
        String str5 = zv3Var.p;
        if (str5 == null) {
            str5 = "";
        }
        contact.link = str5;
        String str6 = zv3Var.q;
        if (str6 == null) {
            str6 = "";
        }
        contact.birthday = str6;
        contact.lastSearchClickTime = zv3Var.r;
        contact.lastSyncTime = zv3Var.s;
        contact.lastShowingUnknownContactBar = zv3Var.t;
        contact.profileOptions = zv3Var.v;
        if (!list2.isEmpty()) {
            int size = list2.size();
            contact.names = new Protos.Contact.ContactName[size];
            for (int i4 = 0; i4 < size; i4++) {
                tv3 tv3Var = (tv3) list2.get(i4);
                Protos.Contact.ContactName contactName = new Protos.Contact.ContactName();
                String str7 = tv3Var.a;
                if (str7 == null) {
                    str7 = "";
                }
                contactName.name = str7;
                String str8 = tv3Var.b;
                if (str8 == null) {
                    str8 = "";
                }
                contactName.lastName = str8;
                int iOrdinal = tv3Var.c.ordinal();
                if (iOrdinal == 0) {
                    i3 = 1;
                } else if (iOrdinal == 1) {
                    i3 = 2;
                } else if (iOrdinal == 2) {
                    i3 = 3;
                } else {
                    if (iOrdinal != 3) {
                        throw new IncompatibleClassChangeError();
                    }
                    i3 = 0;
                }
                contactName.type = i3;
                contact.names[i4] = contactName;
            }
        }
        if (xv3Var == null) {
            contact.status = 0;
        } else if (xv3Var == xv3.a) {
            contact.status = 1;
        } else {
            if (xv3Var != xv3.b) {
                throw new IllegalArgumentException("unknown status " + xv3Var);
            }
            contact.status = 2;
        }
        int iOrdinal2 = zv3Var.k.ordinal();
        if (iOrdinal2 == 0) {
            contact.type = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new IllegalArgumentException("unknown type");
            }
            contact.type = 1;
        }
        int iV = az1.v(zv3Var.l);
        if (iV != 0) {
            if (iV == 1) {
                contact.gender = 1;
            } else {
                if (iV != 2) {
                    throw new IllegalArgumentException("unknown type");
                }
                contact.gender = 2;
            }
            i = 0;
        } else {
            i = 0;
            contact.gender = 0;
        }
        if (uv3Var != null) {
            Protos.Contact.MenuButton menuButton = new Protos.Contact.MenuButton();
            String str9 = uv3Var.a;
            if (str9 == null) {
                str9 = "";
            }
            menuButton.text = str9;
            contact.menuButton = menuButton;
        }
        if (!list.isEmpty()) {
            contact.options = new int[list.size()];
            for (int i5 = i; i5 < contact.options.length; i5++) {
                int iOrdinal3 = ((vv3) list.get(i5)).ordinal();
                if (iOrdinal3 == 0) {
                    i2 = i;
                } else if (iOrdinal3 == 1) {
                    i2 = 1;
                } else if (iOrdinal3 == 2) {
                    i2 = 2;
                } else if (iOrdinal3 != 3) {
                    i2 = 4;
                    if (iOrdinal3 != 4) {
                        i2 = 5;
                        if (iOrdinal3 != 5) {
                            throw new IncompatibleClassChangeError();
                        }
                    } else {
                        continue;
                    }
                } else {
                    i2 = 3;
                }
                contact.options[i5] = i2;
            }
        }
        if (wv3Var != null) {
            Protos.Contact.StartMessage startMessage = new Protos.Contact.StartMessage();
            String str10 = wv3Var.b;
            startMessage.text = str10 != null ? str10 : "";
            w10 w10Var = wv3Var.a;
            if (w10Var != null) {
                startMessage.media = a.d(w10Var);
            } else {
                startMessage.media = null;
            }
            List list3 = wv3Var.c;
            if (list3 != null) {
                startMessage.elements = dj9.c(list3).elements;
            } else {
                startMessage.elements = null;
            }
            contact.startMessage = startMessage;
        }
        return fl9.toByteArray(contact);
    }

    public static q72 c(Context context) {
        wu1 wu1VarA;
        w9c w9cVar = w9c.f;
        synchronized (w9cVar.a) {
            wu1VarA = w9cVar.b;
            if (wu1VarA == null) {
                wu1VarA = ixi.a(new z9a(w9cVar, 6, new q32(context)));
                w9cVar.b = wu1VarA;
            }
        }
        t12 t12Var = new t12(3, new i0(7, context));
        return wsf.l(wu1VarA, new usd(19, t12Var), ayi.a());
    }
}

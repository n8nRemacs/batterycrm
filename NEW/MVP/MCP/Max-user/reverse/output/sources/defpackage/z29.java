package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentWrapperWidget;
import one.me.chats.picker.contacts.ContactsPickerScreen;
import one.me.folders.picker.FolderMemberPickerScreen;
import ru.ok.messages.location.FrgLocationMap;

/* loaded from: classes2.dex */
public final class z29 implements di4 {
    public final /* synthetic */ int a;
    public final ki4 b;

    public z29(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = br.b;
                break;
            case 2:
                this.b = xb6.b;
                break;
            case 3:
                this.b = vh7.b;
                break;
            case 4:
                this.b = l28.b;
                break;
            case 5:
                this.b = bxb.b;
                break;
            case 6:
                this.b = vdh.b;
                break;
            default:
                this.b = a39.b;
                break;
        }
    }

    @Override // defpackage.di4
    public final ki4 a() {
        switch (this.a) {
            case 0:
                return (a39) this.b;
            case 1:
                return (br) this.b;
            case 2:
                return (xb6) this.b;
            case 3:
                return (vh7) this.b;
            case 4:
                return (l28) this.b;
            case 5:
                return (bxb) this.b;
            default:
                return (vdh) this.b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [k28] */
    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        mi4 np1Var;
        mi4 w91Var;
        mi4 mi4Var;
        j28 j28Var;
        int i = this.a;
        int i2 = 2;
        int i3 = 1;
        ki4 ki4Var = this.b;
        switch (i) {
            case 0:
                if (!((a39) ki4Var).a.contains(gi4Var)) {
                    return null;
                }
                a39.b.getClass();
                if (gi4Var.equals(a39.c)) {
                    Boolean boolB = l8j.b("from_qr_scanner", bundle);
                    np1Var = new y29(boolB != null ? boolB.booleanValue() : false, l8j.d("source_id", bundle), 0);
                } else {
                    if (!gi4Var.equals(a39.d)) {
                        wqi.e(z29.class.getName(), ho7.h("invalid route ", gi4Var), new IllegalArgumentException(ho7.h("invalid route ", gi4Var)));
                        return null;
                    }
                    np1Var = new np1(bundle, 9);
                }
                return new ni4(str, gi4Var, bundle, 1, null, np1Var, 16);
            case 1:
                if (!((br) ki4Var).a.contains(gi4Var)) {
                    return null;
                }
                if (gi4Var.equals(br.c)) {
                    return new ni4(str, gi4Var, bundle, 1, null, new g(2), 16);
                }
                throw new IllegalStateException(az1.h("Unknown route=", gi4Var));
            case 2:
                if (!((xb6) ki4Var).a.contains(gi4Var)) {
                    return null;
                }
                xb6.b.getClass();
                if (gi4Var.equals(xb6.c)) {
                    w91Var = new g(17);
                } else if (gi4Var.equals(xb6.e)) {
                    w91Var = new np1(bundle, 4);
                } else if (gi4Var.equals(xb6.f)) {
                    Long lD = l8j.d("chat_id", bundle);
                    w91Var = new w91(lD != null ? lD.longValue() : 0L, i3);
                } else {
                    if (gi4Var.equals(xb6.h)) {
                        final String string = bundle.getString("folder_id");
                        if (string == null) {
                            string = "";
                        }
                        String string2 = bundle.getString("tag");
                        final String str2 = string2 != null ? string2 : "";
                        final long[] jArrE = l8j.e("members_ids", bundle);
                        mi4Var = new mi4() { // from class: u86
                            @Override // defpackage.mi4
                            public final Object a() {
                                return new FolderMemberPickerScreen(string, str2, jArrE);
                            }
                        };
                        return new ni4(str, gi4Var, bundle, 0, null, mi4Var, 24);
                    }
                    if (gi4Var.equals(xb6.d)) {
                        w91Var = new np1(bundle, 5);
                    } else {
                        if (!gi4Var.equals(xb6.g)) {
                            return null;
                        }
                        w91Var = new w91(l8j.i("id", bundle), i2);
                    }
                }
                mi4Var = w91Var;
                return new ni4(str, gi4Var, bundle, 0, null, mi4Var, 24);
            case 3:
                if (!((vh7) ki4Var).a.contains(gi4Var)) {
                    return null;
                }
                vh7.b.getClass();
                if (gi4Var.equals(vh7.c)) {
                    return new ni4(str, gi4Var, bundle, 1, new li4(new i77(5), new i77(6)), new g(18));
                }
                throw new IllegalStateException(az1.h("invalid route ", gi4Var));
            case 4:
                if (!((l28) ki4Var).a.contains(gi4Var)) {
                    return null;
                }
                if (gi4Var.equals(l28.c)) {
                    final cf8 cf8Var = new cf8(l8j.g("lat", bundle), l8j.g("lon", bundle));
                    String string3 = bundle.getString("z");
                    Float fValueOf = string3 != null ? Float.valueOf(Float.parseFloat(string3)) : null;
                    final float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
                    Long lD2 = l8j.d("chat_id", bundle);
                    final long jLongValue = lD2 != null ? lD2.longValue() : 0L;
                    Long lD3 = l8j.d("msg_id", bundle);
                    final long jLongValue2 = lD3 != null ? lD3.longValue() : 0L;
                    final Long lD4 = l8j.d("sender_id", bundle);
                    j28Var = new mi4() { // from class: k28
                        @Override // defpackage.mi4
                        public final Object a() {
                            return new FragmentWrapperWidget(2050629066, FrgLocationMap.class, "ru.ok.messages.location.FrgLocationMap", gwi.b(new imb("ru.ok.tamtam.extra.CHAT_ID", Long.valueOf(jLongValue)), new imb("ru.ok.tamtam.extra.MESSAGE_ID", Long.valueOf(jLongValue2)), new imb("ru.ok.tamtam.extra.LOCATION", cf8Var), new imb("ru.ok.tamtam.extra.ZOOM", Float.valueOf(fFloatValue)), new imb("ru.ok.tamtam.extra.CONTACT_ID", lD4)));
                        }
                    };
                } else {
                    if (!gi4Var.equals(l28.d)) {
                        throw new IllegalStateException(az1.h("unknown route ", gi4Var));
                    }
                    int iH = l8j.h("request_code", bundle);
                    Long lD5 = l8j.d("chat_id", bundle);
                    j28Var = new j28(iH, lD5 != null ? lD5.longValue() : 0L);
                }
                return new ni4(str, gi4Var, bundle, 1, null, j28Var, 16);
            case 5:
                if (!((bxb) ki4Var).a.contains(gi4Var)) {
                    return null;
                }
                li4 li4Var = li4.c;
                if (!gi4Var.equals(bxb.c)) {
                    throw new IllegalStateException(az1.h("invalid route ", gi4Var));
                }
                li4 li4Var2 = new li4(new zfb(11), new zfb(12));
                final int iH2 = l8j.h("request_code", bundle);
                return new ni4(str, gi4Var, bundle, 1, li4Var2, new mi4() { // from class: axb
                    @Override // defpackage.mi4
                    public final Object a() {
                        return new ContactsPickerScreen(iH2);
                    }
                });
            default:
                if (((vdh) ki4Var).a.contains(gi4Var)) {
                    return new ni4(str, gi4Var, bundle, 0, new li4(new q8g(18), 1), new afc(l8j.i("chat_id", bundle), l8j.k("video_url", bundle), l8j.i("msg_id", bundle)), 8);
                }
                return null;
        }
    }
}

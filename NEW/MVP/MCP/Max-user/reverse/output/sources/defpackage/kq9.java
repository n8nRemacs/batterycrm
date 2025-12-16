package defpackage;

import java.util.List;
import ru.ok.tamtam.nano.a;

/* loaded from: classes2.dex */
public final class kq9 extends ug5 {
    public final /* synthetic */ int d;
    public final /* synthetic */ lq9 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kq9(lq9 lq9Var, lrd lrdVar, int i) {
        super(lrdVar);
        this.d = i;
        this.o = lq9Var;
    }

    @Override // defpackage.j3
    public final String d() {
        switch (this.d) {
            case 0:
                return "UPDATE OR ABORT `messages` SET `id` = ?,`server_id` = ?,`time` = ?,`chat_id` = ?,`update_time` = ?,`sender` = ?,`cid` = ?,`text` = ?,`elements` = ?,`reactions` = ?,`msg_link_type` = ?,`msg_link_id` = ?,`inserted_from_msg_link` = ?,`msg_link_chat_id` = ?,`msg_link_chat_name` = ?,`msg_link_chat_link` = ?,`msg_link_chat_icon_url` = ?,`msg_link_chat_access_type` = ?,`status` = ?,`type` = ?,`view_time` = ?,`options` = ?,`live_until` = ?,`delayed_attrs_time_to_fire` = ?,`delayed_attrs_notify_sender` = ? WHERE `id` = ?";
            case 1:
                return "UPDATE OR ABORT `messages` SET `id` = ?,`server_id` = ?,`time` = ?,`update_time` = ?,`sender` = ?,`cid` = ?,`text` = ?,`delivery_status` = ?,`status` = ?,`time_local` = ?,`error` = ?,`localized_error` = ?,`attaches` = ?,`media_type` = ?,`detect_share` = ?,`msg_link_type` = ?,`msg_link_id` = ?,`inserted_from_msg_link` = ?,`msg_link_chat_id` = ?,`msg_link_chat_name` = ?,`msg_link_chat_link` = ?,`msg_link_chat_icon_url` = ?,`msg_link_chat_access_type` = ?,`msg_link_out_chat_id` = ?,`msg_link_out_msg_id` = ?,`type` = ?,`chat_id` = ?,`channel_views` = ?,`channel_forwards` = ?,`view_time` = ?,`options` = ?,`live_until` = ?,`elements` = ?,`reactions` = ?,`delayed_attrs_time_to_fire` = ?,`delayed_attrs_notify_sender` = ?,`reactions_update_time` = ? WHERE `id` = ?";
            case 2:
                return "UPDATE OR ABORT `messages` SET `id` = ?,`attaches` = ?,`media_type` = ? WHERE `id` = ?";
            default:
                return "UPDATE OR ABORT `messages` SET `id` = ?,`text` = ?,`elements` = ?,`status` = ? WHERE `id` = ?";
        }
    }

    @Override // defpackage.ug5
    public final void z(vk6 vk6Var, Object obj) {
        int i = this.d;
        lq9 lq9Var = this.o;
        switch (i) {
            case 0:
                ml9 ml9Var = (ml9) obj;
                vk6Var.k(1, ml9Var.a);
                vk6Var.k(2, ml9Var.b);
                vk6Var.k(3, ml9Var.c);
                vk6Var.k(4, ml9Var.d);
                vk6Var.k(5, ml9Var.e);
                vk6Var.k(6, ml9Var.f);
                vk6Var.k(7, ml9Var.g);
                String str = ml9Var.h;
                if (str == null) {
                    vk6Var.S(8);
                } else {
                    vk6Var.f(8, str);
                }
                ky9 ky9VarB = lq9Var.b();
                List list = ml9Var.i;
                ky9VarB.getClass();
                vk6Var.D(9, dj9.b(list));
                ky9 ky9VarB2 = lq9Var.b();
                xl9 xl9Var = ml9Var.j;
                ky9VarB2.getClass();
                byte[] bArrG = ky9.g(xl9Var);
                if (bArrG == null) {
                    vk6Var.S(10);
                } else {
                    vk6Var.D(10, bArrG);
                }
                vk6Var.k(11, ml9Var.k);
                vk6Var.k(12, ml9Var.l);
                vk6Var.k(13, ml9Var.m ? 1L : 0L);
                vk6Var.k(14, ml9Var.n);
                String str2 = ml9Var.o;
                if (str2 == null) {
                    vk6Var.S(15);
                } else {
                    vk6Var.f(15, str2);
                }
                String str3 = ml9Var.p;
                if (str3 == null) {
                    vk6Var.S(16);
                } else {
                    vk6Var.f(16, str3);
                }
                String str4 = ml9Var.q;
                if (str4 == null) {
                    vk6Var.S(17);
                } else {
                    vk6Var.f(17, str4);
                }
                m73 m73VarA = lq9Var.a();
                int i2 = ml9Var.r;
                m73VarA.getClass();
                if (m73.b(i2) == null) {
                    vk6Var.S(18);
                } else {
                    vk6Var.k(18, r3.intValue());
                }
                ky9 ky9VarB3 = lq9Var.b();
                jm9 jm9Var = ml9Var.s;
                ky9VarB3.getClass();
                vk6Var.k(19, jm9Var.a);
                ky9 ky9VarB4 = lq9Var.b();
                int i3 = ml9Var.t;
                ky9VarB4.getClass();
                vk6Var.k(20, vb9.c(i3));
                vk6Var.k(21, ml9Var.u);
                vk6Var.k(22, ml9Var.v);
                vk6Var.k(23, ml9Var.w);
                Long l = ml9Var.x;
                if (l == null) {
                    vk6Var.S(24);
                } else {
                    vk6Var.k(24, l.longValue());
                }
                Boolean bool = ml9Var.y;
                if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
                    vk6Var.S(25);
                } else {
                    vk6Var.k(25, r16.intValue());
                }
                vk6Var.k(26, ml9Var.a);
                break;
            case 1:
                gj9 gj9Var = (gj9) obj;
                vk6Var.k(1, gj9Var.a);
                vk6Var.k(2, gj9Var.b);
                vk6Var.k(3, gj9Var.c);
                vk6Var.k(4, gj9Var.d);
                vk6Var.k(5, gj9Var.e);
                vk6Var.k(6, gj9Var.f);
                String str5 = gj9Var.g;
                if (str5 == null) {
                    vk6Var.S(7);
                } else {
                    vk6Var.f(7, str5);
                }
                ky9 ky9VarB5 = lq9Var.b();
                xi9 xi9Var = gj9Var.h;
                ky9VarB5.getClass();
                vk6Var.k(8, xi9Var.a);
                ky9 ky9VarB6 = lq9Var.b();
                jm9 jm9Var2 = gj9Var.i;
                ky9VarB6.getClass();
                vk6Var.k(9, jm9Var2.a);
                vk6Var.k(10, gj9Var.j);
                String str6 = gj9Var.k;
                if (str6 == null) {
                    vk6Var.S(11);
                } else {
                    vk6Var.f(11, str6);
                }
                String str7 = gj9Var.l;
                if (str7 == null) {
                    vk6Var.S(12);
                } else {
                    vk6Var.f(12, str7);
                }
                ky9 ky9VarB7 = lq9Var.b();
                jdc jdcVar = gj9Var.m;
                ky9VarB7.getClass();
                byte[] byteArray = jdcVar != null ? fl9.toByteArray(a.f(jdcVar)) : null;
                if (byteArray == null) {
                    vk6Var.S(13);
                } else {
                    vk6Var.D(13, byteArray);
                }
                vk6Var.k(14, gj9Var.n);
                vk6Var.k(15, gj9Var.o ? 1L : 0L);
                vk6Var.k(16, gj9Var.p);
                vk6Var.k(17, gj9Var.q);
                vk6Var.k(18, gj9Var.r ? 1L : 0L);
                vk6Var.k(19, gj9Var.s);
                String str8 = gj9Var.t;
                if (str8 == null) {
                    vk6Var.S(20);
                } else {
                    vk6Var.f(20, str8);
                }
                String str9 = gj9Var.u;
                if (str9 == null) {
                    vk6Var.S(21);
                } else {
                    vk6Var.f(21, str9);
                }
                String str10 = gj9Var.v;
                if (str10 == null) {
                    vk6Var.S(22);
                } else {
                    vk6Var.f(22, str10);
                }
                m73 m73VarA2 = lq9Var.a();
                int i4 = gj9Var.J;
                m73VarA2.getClass();
                if (m73.b(i4) == null) {
                    vk6Var.S(23);
                } else {
                    vk6Var.k(23, r3.intValue());
                }
                vk6Var.k(24, gj9Var.w);
                vk6Var.k(25, gj9Var.x);
                ky9 ky9VarB8 = lq9Var.b();
                int i5 = gj9Var.K;
                ky9VarB8.getClass();
                vk6Var.k(26, vb9.c(i5));
                vk6Var.k(27, gj9Var.y);
                vk6Var.k(28, gj9Var.z);
                vk6Var.k(29, gj9Var.A);
                vk6Var.k(30, gj9Var.B);
                vk6Var.k(31, gj9Var.C);
                vk6Var.k(32, gj9Var.D);
                ky9 ky9VarB9 = lq9Var.b();
                List list2 = gj9Var.E;
                ky9VarB9.getClass();
                vk6Var.D(33, dj9.b(list2));
                ky9 ky9VarB10 = lq9Var.b();
                xl9 xl9Var2 = gj9Var.F;
                ky9VarB10.getClass();
                byte[] bArrG2 = ky9.g(xl9Var2);
                if (bArrG2 == null) {
                    vk6Var.S(34);
                } else {
                    vk6Var.D(34, bArrG2);
                }
                Long l2 = gj9Var.G;
                if (l2 == null) {
                    vk6Var.S(35);
                } else {
                    vk6Var.k(35, l2.longValue());
                }
                Boolean bool2 = gj9Var.H;
                if ((bool2 != null ? Integer.valueOf(bool2.booleanValue() ? 1 : 0) : null) == null) {
                    vk6Var.S(36);
                } else {
                    vk6Var.k(36, r16.intValue());
                }
                vk6Var.k(37, gj9Var.I);
                vk6Var.k(38, gj9Var.a);
                break;
            case 2:
                wsg wsgVar = (wsg) obj;
                vk6Var.k(1, wsgVar.a);
                ky9 ky9VarB11 = lq9Var.b();
                jdc jdcVar2 = wsgVar.b;
                ky9VarB11.getClass();
                byte[] byteArray2 = jdcVar2 != null ? fl9.toByteArray(a.f(jdcVar2)) : null;
                if (byteArray2 == null) {
                    vk6Var.S(2);
                } else {
                    vk6Var.D(2, byteArray2);
                }
                vk6Var.k(3, wsgVar.c);
                vk6Var.k(4, wsgVar.a);
                break;
            default:
                ptg ptgVar = (ptg) obj;
                vk6Var.k(1, ptgVar.a);
                String str11 = ptgVar.b;
                if (str11 == null) {
                    vk6Var.S(2);
                } else {
                    vk6Var.f(2, str11);
                }
                ky9 ky9VarB12 = lq9Var.b();
                List list3 = ptgVar.c;
                ky9VarB12.getClass();
                vk6Var.D(3, dj9.b(list3));
                ky9 ky9VarB13 = lq9Var.b();
                jm9 jm9Var3 = ptgVar.d;
                ky9VarB13.getClass();
                vk6Var.k(4, jm9Var3.a);
                vk6Var.k(5, ptgVar.a);
                break;
        }
    }
}

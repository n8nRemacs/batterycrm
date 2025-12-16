package one.me.messages.list.loader;

import android.text.Layout;
import androidx.annotation.Keep;
import defpackage.a9h;
import defpackage.az1;
import defpackage.dl9;
import defpackage.el9;
import defpackage.fn9;
import defpackage.fni;
import defpackage.ghh;
import defpackage.j37;
import defpackage.lz;
import defpackage.pm9;
import defpackage.t98;
import defpackage.tk9;
import defpackage.u45;
import defpackage.utb;
import defpackage.v32;
import defpackage.wmf;
import defpackage.xi9;
import defpackage.xl9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lone/me/messages/list/loader/MessageModel;", "Lj37;", "Lt98;", "el9", "dl9", "Companion", "message-list_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MessageModel implements j37, t98 {
    public static final Companion L0 = new Companion();
    public final int A0;
    public final CharSequence B0;
    public final boolean C0;
    public final xl9 D0;
    public final long E0;
    public final boolean F0;
    public final xi9 G0;
    public Layout H0;
    public Layout I0;
    public dl9 J0;
    public int K0;
    public final CharSequence X;
    public final ghh Y;
    public final boolean Z;
    public final long a;
    public final long b;
    public final long c;
    public final CharSequence d;
    public final CharSequence o;
    public final boolean s0;
    public final lz t0;
    public final boolean u0;
    public final boolean v0;
    public final pm9 w0;
    public final tk9 x0;
    public final el9 y0;
    public final v32 z0;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lone/me/messages/list/loader/MessageModel$Companion;", "", "", "displayText", "", "pinId", "Lone/me/messages/list/loader/MessageModel;", "control", "(Ljava/lang/CharSequence;J)Lone/me/messages/list/loader/MessageModel;", "message-list_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        @Keep
        public final MessageModel control(CharSequence displayText, long pinId) {
            lz lzVar = lz.d;
            xi9 xi9Var = xi9.o;
            return new MessageModel(0L, 0L, 0L, displayText, "", "", ghh.b, false, false, lzVar, false, false, null, null, new el9(pinId), null, 2, null, false, null, 0L, true, xi9Var, null, 0, 50772992);
        }
    }

    public MessageModel(long j, long j2, long j3, CharSequence charSequence, String str, CharSequence charSequence2, ghh ghhVar, boolean z, boolean z2, lz lzVar, boolean z3, boolean z4, pm9 pm9Var, tk9 tk9Var, el9 el9Var, v32 v32Var, int i, String str2, boolean z5, xl9 xl9Var, long j4, boolean z6, xi9 xi9Var, dl9 dl9Var, int i2, int i3) {
        boolean z7 = (i3 & 1024) != 0 ? false : z3;
        boolean z8 = (i3 & 2048) != 0 ? false : z4;
        pm9 pm9Var2 = (i3 & 4096) != 0 ? null : pm9Var;
        tk9 tk9Var2 = (i3 & 8192) != 0 ? null : tk9Var;
        el9 el9Var2 = (i3 & 16384) != 0 ? null : el9Var;
        v32 v32Var2 = (32768 & i3) != 0 ? null : v32Var;
        String str3 = (131072 & i3) != 0 ? null : str2;
        boolean z9 = (262144 & i3) == 0 ? z5 : false;
        dl9 dl9Var2 = (33554432 & i3) != 0 ? null : dl9Var;
        int i4 = (i3 & 67108864) != 0 ? -1 : i2;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = charSequence;
        this.o = str;
        this.X = charSequence2;
        this.Y = ghhVar;
        this.Z = z;
        this.s0 = z2;
        this.t0 = lzVar;
        this.u0 = z7;
        this.v0 = z8;
        this.w0 = pm9Var2;
        this.x0 = tk9Var2;
        this.y0 = el9Var2;
        this.z0 = v32Var2;
        this.A0 = i;
        this.B0 = str3;
        this.C0 = z9;
        this.D0 = xl9Var;
        this.E0 = j4;
        this.F0 = z6;
        this.G0 = xi9Var;
        this.H0 = null;
        this.I0 = null;
        this.J0 = dl9Var2;
        this.K0 = i4;
    }

    @Keep
    public static final MessageModel control(CharSequence charSequence, long j) {
        return L0.control(charSequence, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageModel)) {
            return false;
        }
        MessageModel messageModel = (MessageModel) obj;
        return this.a == messageModel.a && this.b == messageModel.b && this.c == messageModel.c && fni.a(this.d, messageModel.d) && fni.a(this.o, messageModel.o) && fni.a(this.X, messageModel.X) && this.Y == messageModel.Y && this.Z == messageModel.Z && this.s0 == messageModel.s0 && fni.a(this.t0, messageModel.t0) && this.u0 == messageModel.u0 && this.v0 == messageModel.v0 && fni.a(this.w0, messageModel.w0) && fni.a(this.x0, messageModel.x0) && fni.a(this.y0, messageModel.y0) && fni.a(this.z0, messageModel.z0) && this.A0 == messageModel.A0 && fni.a(this.B0, messageModel.B0) && this.C0 == messageModel.C0 && fni.a(this.D0, messageModel.D0) && this.E0 == messageModel.E0 && this.F0 == messageModel.F0 && this.G0 == messageModel.G0 && fni.a(this.H0, messageModel.H0) && fni.a(this.I0, messageModel.I0) && fni.a(this.J0, messageModel.J0) && this.K0 == messageModel.K0;
    }

    @Override // defpackage.j37
    /* renamed from: getId, reason: from getter */
    public final long getA() {
        return this.a;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a;
    }

    @Override // defpackage.j37
    /* renamed from: getTime, reason: from getter */
    public final long getC() {
        return this.c;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return this.a == t98Var.getItemId();
    }

    public final int hashCode() {
        int iB = a9h.b(a9h.b((this.t0.hashCode() + a9h.b(a9h.b((this.Y.hashCode() + u45.g(this.X, u45.g(this.o, u45.g(this.d, a9h.a(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31), 31)) * 31, 31, this.Z), 31, this.s0)) * 31, 31, this.u0), 31, this.v0);
        pm9 pm9Var = this.w0;
        int iHashCode = (iB + (pm9Var == null ? 0 : pm9Var.hashCode())) * 31;
        tk9 tk9Var = this.x0;
        int iHashCode2 = (iHashCode + (tk9Var == null ? 0 : tk9Var.hashCode())) * 31;
        el9 el9Var = this.y0;
        int iHashCode3 = (iHashCode2 + (el9Var == null ? 0 : Long.hashCode(el9Var.a))) * 31;
        v32 v32Var = this.z0;
        int iK = utb.k(this.A0, (iHashCode3 + (v32Var == null ? 0 : v32Var.hashCode())) * 31, 31);
        CharSequence charSequence = this.B0;
        int iB2 = a9h.b((iK + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.C0);
        xl9 xl9Var = this.D0;
        int iHashCode4 = (this.G0.hashCode() + a9h.b(a9h.a((iB2 + (xl9Var == null ? 0 : xl9Var.hashCode())) * 31, 31, this.E0), 31, this.F0)) * 31;
        Layout layout = this.H0;
        int iHashCode5 = (iHashCode4 + (layout == null ? 0 : layout.hashCode())) * 31;
        Layout layout2 = this.I0;
        int iHashCode6 = (iHashCode5 + (layout2 == null ? 0 : layout2.hashCode())) * 31;
        dl9 dl9Var = this.J0;
        return Integer.hashCode(this.K0) + ((iHashCode6 + (dl9Var != null ? dl9Var.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    @Override // defpackage.t98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.t98 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof one.me.messages.list.loader.MessageModel
            if (r2 != 0) goto La
            r1 = 0
            return r1
        La:
            lz r2 = r0.t0
            yl7 r3 = r2.c
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L1b
            r6 = r1
            one.me.messages.list.loader.MessageModel r6 = (one.me.messages.list.loader.MessageModel) r6
            lz r6 = r6.t0
            yl7 r6 = r6.c
            if (r6 != 0) goto L2c
        L1b:
            if (r3 == 0) goto L29
            r6 = r1
            one.me.messages.list.loader.MessageModel r6 = (one.me.messages.list.loader.MessageModel) r6
            lz r6 = r6.t0
            yl7 r6 = r6.c
            boolean r3 = r3.a(r6)
            goto L2a
        L29:
            r3 = r5
        L2a:
            if (r3 != 0) goto L2e
        L2c:
            r15 = r5
            goto L2f
        L2e:
            r15 = r4
        L2f:
            android.text.Layout r3 = r0.H0
            one.me.messages.list.loader.MessageModel r1 = (one.me.messages.list.loader.MessageModel) r1
            android.text.Layout r6 = r1.H0
            boolean r3 = defpackage.fni.a(r3, r6)
            r7 = r3 ^ 1
            android.text.Layout r3 = r0.I0
            android.text.Layout r6 = r1.I0
            boolean r3 = defpackage.fni.a(r3, r6)
            r8 = r3 ^ 1
            ghh r3 = r0.Y
            ghh r6 = r1.Y
            if (r3 == r6) goto L4d
            r10 = r5
            goto L4e
        L4d:
            r10 = r4
        L4e:
            java.lang.CharSequence r3 = r0.o
            java.lang.CharSequence r6 = r1.o
            boolean r3 = defpackage.fni.a(r3, r6)
            r9 = r3 ^ 1
            pm9 r3 = r0.w0
            pm9 r6 = r1.w0
            boolean r3 = defpackage.fni.a(r3, r6)
            r11 = r3 ^ 1
            xl9 r3 = r0.D0
            xl9 r6 = r1.D0
            boolean r3 = defpackage.fni.a(r3, r6)
            r12 = r3 ^ 1
            boolean r3 = r0.u0
            boolean r6 = r1.u0
            if (r3 == r6) goto L74
            r13 = r5
            goto L75
        L74:
            r13 = r4
        L75:
            lz r3 = r1.t0
            boolean r2 = r2.equals(r3)
            r14 = r2 ^ 1
            java.lang.CharSequence r2 = r0.B0
            java.lang.CharSequence r1 = r1.B0
            boolean r1 = defpackage.fni.a(r2, r1)
            r16 = r1 ^ 1
            nl9 r6 = new nl9
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.loader.MessageModel.k(t98):java.lang.Object");
    }

    public final boolean l() {
        return this.y0 != null;
    }

    @Override // defpackage.t98
    /* renamed from: m, reason: from getter */
    public final int getK0() {
        return this.K0;
    }

    public final String n() {
        String strG = fn9.g(this.K0);
        StringBuilder sbL = az1.l(this.a, "\n        MessageModel(mid=", ", sid=");
        sbL.append(this.b);
        az1.r(this.c, " time=", " viewType=", sbL);
        sbL.append(strG);
        sbL.append(")\n    ");
        return wmf.d(sbL.toString());
    }

    @Override // defpackage.t98
    public final boolean q(t98 t98Var) {
        return equals(t98Var);
    }

    public final String toString() {
        Layout layout = this.H0;
        Layout layout2 = this.I0;
        dl9 dl9Var = this.J0;
        String strG = fn9.g(this.K0);
        StringBuilder sbL = az1.l(this.a, "MessageModel(messageId=", ", serverId=");
        sbL.append(this.b);
        az1.r(this.c, ", sortTime=", ", displayText=", sbL);
        sbL.append((Object) this.d);
        sbL.append(", displayTime=");
        sbL.append((Object) this.o);
        sbL.append(", decorTime=");
        sbL.append((Object) this.X);
        sbL.append(", viewStatus=");
        sbL.append(this.Y);
        sbL.append(", drawBackground=");
        az1.t(", needCorners=", ", attachInfo=", sbL, this.Z, this.s0);
        sbL.append(this.t0);
        sbL.append(", isEdit=");
        sbL.append(this.u0);
        sbL.append(", isContentLevel=");
        sbL.append(this.v0);
        sbL.append(", messageTextStaticLayout=");
        sbL.append(this.w0);
        sbL.append(", messageLink=");
        sbL.append(this.x0);
        sbL.append(", controlInfo=");
        sbL.append(this.y0);
        sbL.append(", widgetState=");
        sbL.append(this.z0);
        sbL.append(", chatType=");
        int i = this.A0;
        sbL.append(i != 1 ? i != 2 ? i != 3 ? "null" : "CHANNEL" : "CHAT" : "DIALOG");
        sbL.append(", channelCountViewText=");
        sbL.append((Object) this.B0);
        sbL.append(", hasUnsupportedAttach=");
        sbL.append(this.C0);
        sbL.append(", reactionsData=");
        sbL.append(this.D0);
        sbL.append(", senderId=");
        sbL.append(this.E0);
        sbL.append(", isIncoming=");
        sbL.append(this.F0);
        sbL.append(", deliveryStatus=");
        sbL.append(this.G0);
        sbL.append(", sender=");
        sbL.append(layout);
        sbL.append(", alias=");
        sbL.append(layout2);
        sbL.append(", avatarParams=");
        sbL.append(dl9Var);
        sbL.append(", messageViewType=");
        sbL.append(strG);
        sbL.append(")");
        return sbL.toString();
    }
}

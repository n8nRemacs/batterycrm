package defpackage;

/* loaded from: classes2.dex */
public final class yh8 {
    public static final /* synthetic */ int J = 0;
    public final k18 A;
    public final k18 B;
    public final k18 C;
    public final k18 D;
    public final k18 E;
    public final k18 F;
    public final k18 G;
    public final k18 H;
    public final k18 I;
    public final klc a;
    public final fa6 b;
    public final di8 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final k18 g;
    public final k18 h;
    public final k18 i;
    public final k18 j;
    public final k18 k;
    public final k18 l;
    public final k18 m;
    public final k18 n;
    public final k18 o;
    public final k18 p;
    public final k18 q;
    public final k18 r;
    public final k18 s;
    public final k18 t;
    public final k18 u;
    public final k18 v;
    public final k18 w;
    public final k18 x;
    public final k18 y;
    public final k18 z;

    public yh8(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8, k18 k18Var9, k18 k18Var10, k18 k18Var11, k18 k18Var12, k18 k18Var13, k18 k18Var14, k18 k18Var15, k18 k18Var16, k18 k18Var17, k18 k18Var18, k18 k18Var19, k18 k18Var20, k18 k18Var21, k18 k18Var22, k18 k18Var23, k18 k18Var24, k18 k18Var25, k18 k18Var26, k18 k18Var27, k18 k18Var28, k18 k18Var29, k18 k18Var30, k18 k18Var31, k18 k18Var32, klc klcVar, fa6 fa6Var, di8 di8Var) {
        this.a = klcVar;
        this.b = fa6Var;
        this.c = di8Var;
        this.d = k18Var;
        this.e = k18Var2;
        this.f = k18Var3;
        this.g = k18Var4;
        this.h = k18Var5;
        this.i = k18Var6;
        this.j = k18Var7;
        this.k = k18Var8;
        this.l = k18Var9;
        this.m = k18Var11;
        this.n = k18Var12;
        this.o = k18Var13;
        this.p = k18Var14;
        this.q = k18Var15;
        this.r = k18Var16;
        this.s = k18Var17;
        this.t = k18Var18;
        this.u = k18Var19;
        this.v = k18Var20;
        this.w = k18Var21;
        this.x = k18Var22;
        this.y = k18Var23;
        this.z = k18Var24;
        this.A = k18Var25;
        this.B = k18Var26;
        this.C = k18Var27;
        this.D = k18Var28;
        this.E = k18Var29;
        this.F = k18Var30;
        this.G = k18Var31;
        this.H = k18Var32;
        this.I = k18Var10;
    }

    public static final long a(tid tidVar) {
        int i = s65.d;
        long jI = v9j.i(System.nanoTime(), y65.NANOSECONDS);
        long jK = s65.k(jI, tidVar.a);
        tidVar.a = jI;
        return jK;
    }

    public final ve2 b() {
        return (ve2) this.k.getValue();
    }

    public final z7c c() {
        return (z7c) this.f.getValue();
    }

    public final void d(byte[] bArr) {
        String str;
        String str2;
        lg8 lg8Var = lg8.d;
        pe8 pe8Var = c().a;
        fde fdeVar = pe8Var.T;
        yy7[] yy7VarArr = w4e.m0;
        long jLongValue = ((Number) fdeVar.D(pe8Var, yy7VarArr[37])).longValue();
        String strC = ((fxa) this.e.getValue()).c();
        long j = pe8Var.j();
        if (jLongValue > 0 && jLongValue < j && strC != null && strC.length() != 0) {
            di8 di8Var = this.c;
            bi8 bi8Var = bi8.LOGIN_DROP_CACHE;
            di8Var.getClass();
            di8.o(bi8Var);
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                StringBuilder sbL = az1.l(jLongValue, "Drop cache: resetAt=", ", lastLogin=");
                sbL.append(j);
                l6bVar.c(lg8Var, "yh8", sbL.toString(), null);
            }
            svi.e((nxg) this.H.getValue(), ((q2b) ((lzf) this.C.getValue())).b().plus(bia.a), null, new uh8(this, null), 2);
            return;
        }
        hwa hwaVar = (hwa) this.d.getValue();
        z7c z7cVarT = hwaVar.t();
        pe8 pe8Var2 = z7cVarT.a;
        long jV = pe8Var2.v();
        long jM = pe8Var2.m();
        long jW = pe8Var2.w();
        String name = hwa.class.getName();
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            String strA = d8j.a(Long.valueOf(jV));
            String strA2 = d8j.a(Long.valueOf(jM));
            String strA3 = d8j.a(Long.valueOf(jW));
            StringBuilder sbL2 = wy1.l("LoginTamTask: chatsLastSync = ", strA, ", contactLastSync = ", strA2, ", presenceLastSync = ");
            sbL2.append(strA3);
            str = null;
            l6bVar2.c(lg8Var, name, sbL2.toString(), null);
        } else {
            str = null;
        }
        String string = z7cVarT.b.g.getString("hash", str);
        if (z7cVarT.b.g.getInt("version", 1) < 6) {
            z7cVarT.b.g(6, "version");
            str2 = str;
            jV = 0;
        } else {
            str2 = string;
        }
        long jK = hwaVar.t().a.k();
        String strC2 = ((fxa) hwaVar.d.getValue()).c();
        if (strC2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        hwa.q(hwaVar, new eh8(jK, strC2, jV, jM, jW, str2, pe8Var2.l(), ((Number) pe8Var2.R.D(pe8Var2, yy7VarArr[35])).longValue(), ((Number) pe8Var2.r.D(pe8Var2, yy7VarArr[7])).longValue(), z7cVarT.e.v() ? ((Number) pe8Var2.P0.D(pe8Var2, pe8.U0[29])).longValue() : 0L, bArr));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(62:13|14|200|(1:205)(1:202)|206|(1:211)|212|(1:214)|(1:216)(1:218)|217|219|(1:221)|(1:223)(1:224)|225|(1:236)(3:229|(1:234)(1:231)|235)|237|(1:242)|243|(1:245)(1:(9:248|(1:250)(1:251)|(3:259|(2:262|260)|582)|(1:264)(1:265)|(3:273|(2:276|274)|583)|(1:278)(1:279)|(3:287|(2:290|288)|584)|(1:292)(1:293)|(3:301|(2:304|302)|585)))|305|(1:310)|311|(1:313)|314|(2:316|(1:321))(3:322|(1:327)|328)|329|(1:334)|335|(1:340)|341|(1:346)|347|(1:352)|353|(28:355|(0)|360|(3:365|(1:367)(1:368)|369)|(2:371|(3:377|(1:379)(2:380|(0)(5:383|(6:386|(1:390)(3:391|(0)(2:395|562)|396)|397|563|396|384)|561|398|(3:400|(1:404)|405)))|406)(1:406))(0)|407|(3:412|(1:414)(1:415)|416)(1:409)|(2:418|(2:420|(3:421|(5:423|(3:425|(2:427|(2:440|569)(2:433|(3:435|439|568)(4:436|(1:438)(0)|439|568)))(2:441|567)|442)|566|443|(0)(1:564))(1:446)|(1:448)(1:565)))(1:449))(0)|450|(3:453|(2:456|(1:458))|459)|460|(3:465|(1:467)(1:468)|469)|470|(1:475)|476|(3:478|(1:483)|484)(1:485)|486|(1:488)|489|(4:494|(3:497|(2:580|499)(1:581)|495)|579|493)(1:493)|500|(1:502)(1:504)|503|505|(1:510)|511|(1:513)(1:514)|(6:516|(4:521|(4:524|(1:573)|575|522)|570|532)(1:532)|533|(1:538)|539|540)(2:541|542))(1:358)|359|360|(4:363|365|(0)(0)|369)|(0)(0)|407|(0)(4:410|412|(0)(0)|416)|(0)(0)|450|(0)|460|(4:463|465|(0)(0)|469)|470|(2:473|475)|476|(0)(0)|486|(0)|489|(5:491|494|(1:495)|579|493)(0)|500|(0)(0)|503|505|(2:508|510)|511|(0)(0)|(0)(0))(2:15|16))(22:17|553|18|19|20|557|130|(4:135|136|547|137)(1:132)|143|144|167|(1:172)(1:169)|173|(1:175)(1:176)|177|(3:182|(1:184)(1:185)|186)(1:179)|187|(1:189)|190|(1:195)|196|(1:592)(62:199|14|200|(0)(2:203|205)|206|(2:209|211)|212|(0)|(0)(0)|217|219|(0)|(0)(0)|225|(2:227|236)(0)|237|(2:240|242)|243|(0)(0)|305|(2:308|310)|311|(0)|314|(0)(0)|329|(2:332|334)|335|(2:338|340)|341|(2:344|346)|347|(2:350|352)|353|(0)(0)|359|360|(0)|(0)(0)|407|(0)(0)|(0)(0)|450|(0)|460|(0)|470|(0)|476|(0)(0)|486|(0)|489|(0)(0)|500|(0)(0)|503|505|(0)|511|(0)(0)|(0)(0))))(1:23))(24:24|(1:29)|30|(3:35|(1:37)(1:38)|39)(1:32)|40|(1:42)|43|(3:48|(1:50)(1:51)|52)(1:45)|(1:57)|58|(1:62)|63|(1:65)|66|(1:68)(1:69)|70|(1:75)(1:72)|(3:77|(4:80|(1:589)(4:586|83|(2:86|84)|590)|588|78)|587)|87|(1:92)|93|(1:95)(1:96)|97|(2:99|198)(1:100))|101|(1:106)(1:103)|107|(1:109)|110|(1:115)(1:112)|555|116|543|117|118|551|119|120|545|121|122|549|123|124|559|125|126|(2:128|591)(66:129|20|557|130|(0)(9:133|135|136|547|137|143|144|167|(0)(6:170|172|173|(0)(0)|177|(0)(10:180|182|(0)(0)|186|187|(0)|190|(2:193|195)|196|(0)(0))))|14|200|(0)(0)|206|(0)|212|(0)|(0)(0)|217|219|(0)|(0)(0)|225|(0)(0)|237|(0)|243|(0)(0)|305|(0)|311|(0)|314|(0)(0)|329|(0)|335|(0)|341|(0)|347|(0)|353|(0)(0)|359|360|(0)|(0)(0)|407|(0)(0)|(0)(0)|450|(0)|460|(0)|470|(0)|476|(0)(0)|486|(0)|489|(0)(0)|500|(0)(0)|503|505|(0)|511|(0)(0)|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03dd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03de, code lost:
    
        r10 = r1;
        r1 = r21;
        r3 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03e3, code lost:
    
        r21 = r7;
        r8 = r2;
        r2 = r15;
        r15 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03e9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03ea, code lost:
    
        r10 = r1;
        r23 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03ed, code lost:
    
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03ef, code lost:
    
        r3 = r22;
        r2 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03f4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03f5, code lost:
    
        r10 = r1;
        r25 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03f9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03fa, code lost:
    
        r10 = r1;
        r1 = r21;
        r7 = r25;
        r25 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0402, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0403, code lost:
    
        r14 = "yh8";
        r7 = r25;
        r10 = r1;
        r25 = r2;
        r1 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x040b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x040c, code lost:
    
        r14 = "yh8";
        r7 = r25;
        r10 = r1;
        r25 = r2;
        r1 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x09dd  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x09f7  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0a09  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0a25  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0ad0  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0ad5  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0ad7  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0ae9  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0b06  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0b62  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0bcf  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0be9  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0c0d  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0c1d  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0c1f  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0c3e  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0c79  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0cac  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0cc3  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0ced  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0cf6  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0d00  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0d12  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0d19  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0d29  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0d46  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0d49  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0d4c  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0dcb  */
    /* JADX WARN: Removed duplicated region for block: B:592:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r8v54, types: [pb3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r36, defpackage.gh8 r38, long r39, defpackage.q44 r41) {
        /*
            Method dump skipped, instructions count: 3539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh8.e(long, gh8, long, q44):java.lang.Object");
    }

    /* JADX WARN: Path cross not found for [B:110:0x049e, B:113:0x04b6], limit reached: 125 */
    /* JADX WARN: Path cross not found for [B:113:0x04b6, B:110:0x049e], limit reached: 125 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x044c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0482 -> B:104:0x048a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0149 -> B:41:0x015b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x03d6 -> B:94:0x03dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x042b -> B:97:0x044a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x0436 -> B:97:0x044a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.Map r30, defpackage.q44 r31) {
        /*
            Method dump skipped, instructions count: 1315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh8.f(java.util.Map, q44):java.lang.Object");
    }
}

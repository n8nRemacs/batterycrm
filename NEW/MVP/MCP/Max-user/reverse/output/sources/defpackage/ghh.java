package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ghh {
    public static final ghh X;
    public static final /* synthetic */ ghh[] Y;
    public static final /* synthetic */ zg5 Z;
    public static final ghh b;
    public static final ghh c;
    public static final ghh d;
    public static final ghh o;
    public final Integer a;

    static {
        ghh ghhVar = new ghh("None", 0, null);
        b = ghhVar;
        ghh ghhVar2 = new ghh("Timer", 1, Integer.valueOf(yud.Z));
        c = ghhVar2;
        ghh ghhVar3 = new ghh("Send", 2, Integer.valueOf(yud.l));
        d = ghhVar3;
        ghh ghhVar4 = new ghh("Seen", 3, Integer.valueOf(yud.j));
        o = ghhVar4;
        ghh ghhVar5 = new ghh("Error", 4, Integer.valueOf(ivd.j1));
        X = ghhVar5;
        ghh[] ghhVarArr = {ghhVar, ghhVar2, ghhVar3, ghhVar4, ghhVar5};
        Y = ghhVarArr;
        Z = new zg5(ghhVarArr);
    }

    public ghh(String str, int i, Integer num) {
        this.a = num;
    }

    public static ghh valueOf(String str) {
        return (ghh) Enum.valueOf(ghh.class, str);
    }

    public static ghh[] values() {
        return (ghh[]) Y.clone();
    }
}

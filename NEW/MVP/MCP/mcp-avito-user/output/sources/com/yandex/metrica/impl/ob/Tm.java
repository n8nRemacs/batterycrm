package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class Tm extends Sm<byte[]> {
    public Tm(int i12, @j.N String str, @j.N C38737cm c38737cm) {
        super(i12, str, c38737cm);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38813fn
    @j.P
    public Object a(@j.P Object obj) {
        byte[] bArr = (byte[]) obj;
        if (bArr == null || bArr.length <= super.b()) {
            return bArr;
        }
        byte[] bArr2 = new byte[super.b()];
        System.arraycopy(bArr, 0, bArr2, 0, super.b());
        if (this.f379473c.isEnabled()) {
            this.f379473c.fw("\"%s\" %s exceeded limit of %d bytes", super.a(), bArr, Integer.valueOf(super.b()));
        }
        return bArr2;
    }
}

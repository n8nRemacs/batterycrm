package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.al, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38686al implements InterfaceC39083qk {

    /* renamed from: a, reason: collision with root package name */
    private final int f380133a;

    public C38686al(int i12) {
        this.f380133a = i12;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39083qk
    public void a(@j.N C38711bl c38711bl) {
        if (c38711bl.f380228h.length() > this.f380133a) {
            int length = c38711bl.f380228h.length();
            int i12 = this.f380133a;
            int i13 = length - i12;
            String strSubstring = c38711bl.f380228h.substring(0, i12);
            c38711bl.f380228h = strSubstring;
            c38711bl.f380230j = Integer.valueOf(strSubstring.length() + i13);
        }
    }
}

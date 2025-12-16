package defpackage;

import androidx.media3.common.PlaybackException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class o7a implements r3c {
    public final /* synthetic */ b8a a;

    public o7a(b8a b8aVar) {
        this.a = b8aVar;
    }

    @Override // defpackage.r3c
    public final void A0(c3c c3cVar) {
        float f = c3cVar.a;
        b8a b8aVar = this.a;
        if (f == b8aVar.P0) {
            return;
        }
        b8aVar.P0 = f;
        int i = b8a.U0;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "b8a", "notifyListeners: onPlaybackSpeedChanged", null);
            }
        }
        synchronized (b8aVar.y0) {
            Iterator it = b8aVar.y0.iterator();
            while (it.hasNext()) {
                ((n7a) it.next()).n();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    @Override // defpackage.r3c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G0(defpackage.k09 r10, int r11) {
        /*
            r9 = this;
            b8a r0 = r9.a
            long r2 = r0.j()
            b8a r0 = r9.a
            l09 r4 = r0.k()
            b8a r0 = r9.a
            r0.L0 = r10
            px8 r10 = r0.w0
            if (r10 == 0) goto L19
            boolean r10 = r10.o()
            goto L1a
        L19:
            r10 = 0
        L1a:
            r0.H0 = r10
            b8a r10 = r9.a
            px8 r0 = r10.w0
            r1 = 0
            if (r0 == 0) goto L2c
            k09 r0 = r0.d()
            if (r0 == 0) goto L2c
            w19 r0 = r0.d
            goto L2d
        L2c:
            r0 = r1
        L2d:
            r10.N0 = r0
            b8a r10 = r9.a
            px8 r0 = r10.w0
            r5 = -1
            if (r0 == 0) goto L46
            r0.D()
            ox8 r0 = r0.c
            boolean r6 = r0.isConnected()
            if (r6 == 0) goto L46
            int r0 = r0.L()
            goto L47
        L46:
            r0 = r5
        L47:
            k09 r0 = defpackage.b8a.a(r10, r0)
            r10.M0 = r0
            b8a r10 = r9.a
            px8 r0 = r10.w0
            if (r0 == 0) goto L62
            r0.D()
            ox8 r0 = r0.c
            boolean r6 = r0.isConnected()
            if (r6 == 0) goto L62
            int r5 = r0.H()
        L62:
            defpackage.b8a.a(r10, r5)
            b8a r10 = r9.a
            px8 r10 = r10.w0
            if (r10 == 0) goto L6e
            r10.m()
        L6e:
            java.lang.String r10 = "b8a"
            b8a r0 = r9.a
            l6b r5 = defpackage.wqi.a
            if (r5 != 0) goto L77
            goto L9a
        L77:
            lg8 r6 = defpackage.lg8.d
            boolean r7 = r5.b(r6)
            if (r7 == 0) goto L9a
            boolean r0 = r0.H0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "onMediaItemTransition, reason:"
            r7.<init>(r8)
            r7.append(r11)
            java.lang.String r11 = ", isPlaying:"
            r7.append(r11)
            r7.append(r0)
            java.lang.String r11 = r7.toString()
            r5.c(r6, r10, r11, r1)
        L9a:
            b8a r10 = r9.a
            java.lang.String r11 = "b8a"
            l6b r0 = defpackage.wqi.a
            if (r0 != 0) goto La3
            goto Lb0
        La3:
            lg8 r5 = defpackage.lg8.d
            boolean r6 = r0.b(r5)
            if (r6 == 0) goto Lb0
            java.lang.String r6 = "notifyListeners: onAudioChanged"
            r0.c(r5, r11, r6, r1)
        Lb0:
            java.util.concurrent.CopyOnWriteArraySet r11 = r10.y0
            monitor-enter(r11)
            java.util.concurrent.CopyOnWriteArraySet r0 = r10.y0     // Catch: java.lang.Throwable -> Ld1
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Ld1
        Lb9:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r1 == 0) goto Ld4
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Ld1
            n7a r1 = (defpackage.n7a) r1     // Catch: java.lang.Throwable -> Ld1
            long r5 = r10.j()     // Catch: java.lang.Throwable -> Ld1
            l09 r7 = r10.k()     // Catch: java.lang.Throwable -> Ld1
            r1.c(r2, r4, r5, r7)     // Catch: java.lang.Throwable -> Ld1
            goto Lb9
        Ld1:
            r0 = move-exception
            r10 = r0
            goto Ld6
        Ld4:
            monitor-exit(r11)
            return
        Ld6:
            monitor-exit(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7a.G0(k09, int):void");
    }

    @Override // defpackage.r3c
    public final void L0(PlaybackException playbackException) {
        b8a b8aVar = this.a;
        int i = b8a.U0;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "b8a", "notifyListeners: onError", null);
            }
        }
        synchronized (b8aVar.y0) {
            Iterator it = b8aVar.y0.iterator();
            while (it.hasNext()) {
                ((n7a) it.next()).b(b8aVar.j(), b8aVar.k());
            }
        }
    }

    @Override // defpackage.r3c
    public final void f0(u3c u3cVar, p3c p3cVar) {
        a26 a26Var = p3cVar.a;
        float fA = u3cVar.a();
        b8a b8aVar = this.a;
        px8 px8Var = b8aVar.w0;
        if (px8Var != null) {
            ox8 ox8Var = px8Var.c;
            px8Var.D();
            hsi.a("volume must be between 0 and 1", fA >= 0.0f && fA <= 1.0f);
            if (ox8Var.isConnected()) {
                ox8Var.b(fA);
            } else {
                a8i.l("MediaController", "The controller is not connected. Ignoring setVolume().");
            }
        }
        b8aVar.O0 = u3cVar.getDuration();
        u3cVar.f();
        if (a26Var.a.get(9)) {
            u3cVar.y();
        }
        if (a26Var.a.get(8)) {
            u3cVar.getRepeatMode();
        }
    }

    @Override // defpackage.r3c
    public final void i0(w19 w19Var) {
        b8a b8aVar = this.a;
        b8aVar.N0 = w19Var;
        int i = b8a.U0;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "b8a", "notifyListeners: onMetadataChanged", null);
            }
        }
        synchronized (b8aVar.y0) {
            Iterator it = b8aVar.y0.iterator();
            while (it.hasNext()) {
                ((n7a) it.next()).getClass();
            }
        }
    }

    @Override // defpackage.r3c
    public final void k(int i) {
        k09 k09VarD;
        int i2 = b8a.U0;
        b8a b8aVar = this.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                px8 px8Var = b8aVar.w0;
                l6bVar.c(lg8Var, "b8a", "onPlaybackStateChanged " + i + ", isPlaying:" + (px8Var != null ? Boolean.valueOf(px8Var.o()) : null), null);
            }
        }
        b8a b8aVar2 = this.a;
        b8aVar2.F0 = i;
        px8 px8Var2 = b8aVar2.w0;
        b8aVar2.I0 = px8Var2 != null && px8Var2.getPlaybackState() == 2;
        b8a b8aVar3 = this.a;
        px8 px8Var3 = b8aVar3.w0;
        b8aVar3.H0 = px8Var3 != null ? px8Var3.o() : false;
        b8a b8aVar4 = this.a;
        px8 px8Var4 = b8aVar4.w0;
        b8aVar4.K0 = px8Var4 != null && px8Var4.getPlaybackState() == 4;
        b8a b8aVar5 = this.a;
        px8 px8Var5 = b8aVar5.w0;
        b8aVar5.L0 = px8Var5 != null ? px8Var5.d() : null;
        b8a b8aVar6 = this.a;
        px8 px8Var6 = b8aVar6.w0;
        b8aVar6.N0 = (px8Var6 == null || (k09VarD = px8Var6.d()) == null) ? null : k09VarD.d;
        if (i == 1) {
            this.a.Q0.m(null, Float.valueOf(0.0f));
            b8a b8aVar7 = this.a;
            b8aVar7.G0 = false;
            b8aVar7.d();
            b8a b8aVar8 = this.a;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null) {
                lg8 lg8Var2 = lg8.d;
                if (l6bVar2.b(lg8Var2)) {
                    l6bVar2.c(lg8Var2, "b8a", "notifyListeners: onStop", null);
                }
            }
            synchronized (b8aVar8.y0) {
                Iterator it = b8aVar8.y0.iterator();
                while (it.hasNext()) {
                    ((n7a) it.next()).e(b8aVar8.j(), b8aVar8.k(), ((Number) b8aVar8.C0.getValue()).longValue());
                }
            }
            return;
        }
        if (i == 2) {
            b8a b8aVar9 = this.a;
            l6b l6bVar3 = wqi.a;
            if (l6bVar3 != null) {
                lg8 lg8Var3 = lg8.d;
                if (l6bVar3.b(lg8Var3)) {
                    l6bVar3.c(lg8Var3, "b8a", "notifyListeners: onBuffering", null);
                }
            }
            synchronized (b8aVar9.y0) {
                Iterator it2 = b8aVar9.y0.iterator();
                while (it2.hasNext()) {
                    ((n7a) it2.next()).d(b8aVar9.j(), b8aVar9.k());
                }
            }
            return;
        }
        if (i != 4) {
            return;
        }
        long j = this.a.j();
        l09 l09VarK = this.a.k();
        this.a.d();
        this.a.Q0.m(null, Float.valueOf(1.0f));
        b8a b8aVar10 = this.a;
        l6b l6bVar4 = wqi.a;
        if (l6bVar4 != null) {
            lg8 lg8Var4 = lg8.d;
            if (l6bVar4.b(lg8Var4)) {
                l6bVar4.c(lg8Var4, "b8a", "notifyListeners: onEnd", null);
            }
        }
        synchronized (b8aVar10.y0) {
            Iterator it3 = b8aVar10.y0.iterator();
            while (it3.hasNext()) {
                ((n7a) it3.next()).f(j, l09VarK);
            }
        }
    }

    @Override // defpackage.r3c
    public final void onRepeatModeChanged(int i) {
        b8a b8aVar = this.a;
        int i2 = b8a.U0;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "b8a", "notifyListeners: onRepeatModeChanged", null);
            }
        }
        synchronized (b8aVar.y0) {
            Iterator it = b8aVar.y0.iterator();
            while (it.hasNext()) {
                ((n7a) it.next()).getClass();
            }
        }
    }

    @Override // defpackage.r3c
    public final void q(boolean z) {
        px8 px8Var;
        int i = b8a.U0;
        wqi.c("b8a", "onIsPlayingChanged", new Object[0]);
        b8a b8aVar = this.a;
        b8aVar.G0 = (z || (px8Var = b8aVar.w0) == null || px8Var.getPlaybackState() != 3) ? false : true;
        px8 px8Var2 = this.a.w0;
        if (px8Var2 != null) {
            px8Var2.m();
        }
        b8a b8aVar2 = this.a;
        b8aVar2.H0 = z;
        if (z) {
            b8aVar2.t();
            b8a b8aVar3 = this.a;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, "b8a", "notifyListeners: onPlay", null);
                }
            }
            synchronized (b8aVar3.y0) {
                Iterator it = b8aVar3.y0.iterator();
                while (it.hasNext()) {
                    ((n7a) it.next()).h(b8aVar3.j(), b8aVar3.k());
                }
            }
            return;
        }
        if (b8aVar2.G0) {
            b8aVar2.d();
            b8a b8aVar4 = this.a;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null) {
                lg8 lg8Var2 = lg8.d;
                if (l6bVar2.b(lg8Var2)) {
                    l6bVar2.c(lg8Var2, "b8a", "notifyListeners: onPause", null);
                }
            }
            synchronized (b8aVar4.y0) {
                Iterator it2 = b8aVar4.y0.iterator();
                while (it2.hasNext()) {
                    ((n7a) it2.next()).i(b8aVar4.j(), b8aVar4.k());
                }
            }
        }
    }

    @Override // defpackage.r3c
    public final void t(t3c t3cVar, t3c t3cVar2, int i) {
        Object next;
        w19 w19Var;
        Integer num;
        String str;
        Long lI;
        if (i != 1 || t3cVar.b == t3cVar2.b) {
            return;
        }
        k09 k09Var = t3cVar.c;
        long jLongValue = (k09Var == null || (str = k09Var.a) == null || (lI = cnf.i(str)) == null) ? -1L : lI.longValue();
        k09 k09Var2 = t3cVar.c;
        int iIntValue = (k09Var2 == null || (w19Var = k09Var2.d) == null || (num = w19Var.H) == null) ? -1 : num.intValue();
        f2 f2Var = new f2(0, l09.X);
        while (true) {
            if (!f2Var.hasNext()) {
                next = null;
                break;
            } else {
                next = f2Var.next();
                if (((l09) next).ordinal() == iIntValue) {
                    break;
                }
            }
        }
        l09 l09Var = (l09) next;
        if (l09Var == null) {
            l09Var = l09.a;
        }
        px8 px8Var = this.a.w0;
        if (px8Var != null) {
            int i2 = t3cVar.b;
            px8Var.D();
            ox8 ox8Var = px8Var.c;
            if (i2 == (ox8Var.isConnected() ? ox8Var.H() : -1)) {
                b8a b8aVar = this.a;
                int i3 = b8a.U0;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, "b8a", "notifyListeners: onSkipToNext", null);
                    }
                }
                synchronized (b8aVar.y0) {
                    Iterator it = b8aVar.y0.iterator();
                    while (it.hasNext()) {
                        ((n7a) it.next()).j(jLongValue, l09Var);
                    }
                }
                return;
            }
        }
        px8 px8Var2 = this.a.w0;
        if (px8Var2 != null) {
            int i4 = t3cVar.b;
            px8Var2.D();
            ox8 ox8Var2 = px8Var2.c;
            if (i4 == (ox8Var2.isConnected() ? ox8Var2.L() : -1)) {
                b8a b8aVar2 = this.a;
                int i5 = b8a.U0;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null) {
                    lg8 lg8Var2 = lg8.d;
                    if (l6bVar2.b(lg8Var2)) {
                        l6bVar2.c(lg8Var2, "b8a", "notifyListeners: onSkipToPrevious", null);
                    }
                }
                synchronized (b8aVar2.y0) {
                    Iterator it2 = b8aVar2.y0.iterator();
                    while (it2.hasNext()) {
                        ((n7a) it2.next()).g(jLongValue, l09Var);
                    }
                }
            }
        }
    }
}
